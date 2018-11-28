package com.service;

import com.pojo.Userinfo;

import java.util.List;


public interface IUserinfoMapper {
	
	/**
	 * 删除用户
	 * @param userid
	 * @return
	 */
    public int deleteByPrimaryKey(Short userid);

	/**
	 * 新增用户
	 * @param record
	 * @return
	 */
	public int insert(Userinfo record);
	
	/**
	 * 查看某一个用户
	 * @param userid
	 * @return
	 */
	public Userinfo selectByPrimaryKey(Short userid);

	/**
	 * 查看所有用户
	 * @return
	 */
    public List<Userinfo> selectAll();
    
    /**
     * 修改某一个用户
     * @param record
     * @return
     */
    public int updateByPrimaryKey(Userinfo record);
}