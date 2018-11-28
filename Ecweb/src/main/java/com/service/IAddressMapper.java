package com.service;

import com.pojo.Address;

import java.util.List;

public interface IAddressMapper {
	
	/**
	 * 删除地址
	 * @param addid
	 * @return
	 */
    public int deleteByPrimaryKey(int addid);

	/**
	 * 新增地址
	 * @param record
	 * @return
	 */
	public int insert(Address record);

	/**
	 * 查看某一个用户的地址
	 * @param addid
	 * @return
	 */
	public Address selectByPrimaryKey(int addid);

	/**
	 * 查看所有地址
	 * @return
	 */
    public List<Address> selectAll();

    /**
     * 修改某一个用户的地址
     * @param record
     * @return
     */
    public int updateByPrimaryKey(Address record);
}