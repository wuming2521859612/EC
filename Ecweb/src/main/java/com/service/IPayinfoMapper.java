package com.service;

import com.pojo.Payinfo;

import java.util.List;

public interface IPayinfoMapper {
	
	/**
	 * 删除支付信息
	 * @param payid
	 * @return
	 */
	public int deleteByPrimaryKey(int payid);

	/**
	 * 新增支付信息
	 * @param record
	 * @return
	 */
	public int insert(Payinfo record);

	/**
	 * 查看某一个支付信息
	 * @param payid
	 * @return
	 */
	public Payinfo selectByPrimaryKey(int payid);

	/**
	 * 查看所有支付信息
	 * @return
	 */
    public List<Payinfo> selectAll();

    /**
     * 修改某一个支付信息
     * @param record
     * @return
     */
    public int updateByPrimaryKey(Payinfo record);
}