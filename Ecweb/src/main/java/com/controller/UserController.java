package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.Userinfo;
import com.service.IUserinfoService;

@Controller
public class UserController {
	
	@Autowired
	IUserinfoService userser;	
	public void setUserser(IUserinfoService userser) {
		this.userser = userser;
	}

	@RequestMapping(value="/toRegiUser",method={RequestMethod.GET})
	public String toRegiUser(){
		return "Registered";
	}
	
	@RequestMapping("/firstlogin.com")
	public String tologin(HttpServletRequest req) {
		Cookie[] cookie = req.getCookies();	
		if(cookie!=null && cookie.length>0) {
			System.out.println("正在从cookie中取值");
			String nameAndpwd="";
			for (Cookie c : cookie) {
				if("nameAndpwd".equals(c.getName())){
					nameAndpwd = c.getValue();
				}
			}		
			System.out.println(nameAndpwd);
			String[] nap= nameAndpwd.split("_");			
			String nameOremail = nap[0];
			String userpwd= nap[1];
			Userinfo u = userser.selectuser(nameOremail,userpwd);		
			if(u!=null) {
				System.out.println("==========登录ok=============");
				req.getSession().setAttribute("user", u);				
			}
			return "Home";
		}else {
			return "Login";
		}		
	}
	
	@RequestMapping("/againLogin")
	public String againLogin( HttpServletRequest req) {
		if((req.getSession().getAttribute("user"))!=null) {
			req.getSession().setMaxInactiveInterval(0);		
		}	
		Cookie[] cookie = req.getCookies();				
		if(cookie!=null && cookie.length>0) {
			String nameAndpwd="";
			for (Cookie c : cookie) {
				if("nameAndpwd".equals(c.getName())){
					c.setMaxAge(0);
				}
			}			
		}
		return "Login";
	}
	
	@RequestMapping("/tologin")
	public String login(String nameOremail,String userpwd,String autologin,PrintWriter pw,HttpServletRequest req,HttpServletResponse resp) throws Exception {
		System.out.println(nameOremail+"\t"+userpwd);
		Userinfo u = userser.selectuser(nameOremail,userpwd);		
		if(u!=null) {
			System.out.println("==========登录ok=============");
			req.getSession().setAttribute("user", u);
			if("true".equals(autologin)) {
				System.out.println("加入cookie");
				//创建Cookie
				Cookie nameAndpwd=new Cookie("nameAndpwd",URLEncoder.encode(nameOremail+"_"+userpwd,"utf-8"));
				
				//设置Cookie的父路径
				nameAndpwd.setPath(req.getContextPath()+"/");
				
				
				//保存Cookie的时间长度，单位为秒
				nameAndpwd.setMaxAge(15*24*60*60);
			
				
				//加入Cookie到响应头
				resp.addCookie(nameAndpwd);				
			}
			pw.write("ok");				
			pw.flush();
			pw.close();
			return "Login";
		}else {
			System.out.println("==========登录失败=============");				
			pw.write("no");				
			pw.flush();
			pw.close();
			return "Login";
		}
	}
	
	@RequestMapping("/toHome")
	public String tohome(String user) {
		System.out.println("进入主页面");
		return "Home";
	}
	
	@RequestMapping("/toUser")
	public String toUser() {		
		System.out.println("进入个人中心");
		return "User";
	}
}
