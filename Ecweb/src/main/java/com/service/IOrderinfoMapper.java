package com.service;

import com.pojo.Orderinfo;

import java.util.List;

public interface IOrderinfoMapper {
	/**
	 * 删除订单
	 * @param orderid
	 * @return
	 */
    public int deleteByPrimaryKey(int orderid);

	/**
	 * 新增订单
	 * @param record
	 * @return
	 */
	public int insert(Orderinfo record);

	/**
	 * 查看某一个订单
	 * @param cateid
	 * @return
	 */
	public Orderinfo selectByPrimaryKey(int orderid);

	/**
	 * 查看所有订单
	 * @return
	 */
    public List<Orderinfo> selectAll();

    /**
     * 修改某一个订单
     * @param record
     * @return
     */
    public int updateByPrimaryKey(Orderinfo record);
}