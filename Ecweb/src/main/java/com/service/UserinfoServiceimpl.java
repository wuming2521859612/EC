package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IUserinfoMapper;
import com.pojo.Userinfo;

@Service
public class UserinfoServiceimpl implements IUserinfoService{
	@Autowired
	IUserinfoMapper usermap;
	public void setUsermap(IUserinfoMapper usermap) {
		this.usermap = usermap;
	}


	@Override
	public Userinfo selectuser(String nameOremail,String userpwd) {		
		return usermap.selectuser(nameOremail,userpwd);
	}


	@Override
	public Userinfo selectByPrimaryKey(int userid) {
		// TODO Auto-generated method stub
		return usermap.selectByPrimaryKey(userid);
	}
	
}
