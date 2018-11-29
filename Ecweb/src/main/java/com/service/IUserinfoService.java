package com.service;

import com.pojo.Userinfo;

public interface IUserinfoService {
	public Userinfo selectuser(String nameOremail,String userpwd);
	
	
	public Userinfo selectByPrimaryKey(int userid);
	
}
