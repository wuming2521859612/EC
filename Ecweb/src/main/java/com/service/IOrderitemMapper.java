package com.service;

import com.pojo.Orderinfo;
import com.pojo.Orderitem;

import java.util.List;

public interface IOrderitemMapper {
	
	/**
	 * 删除订单明细
	 * @param itemid
	 * @return
	 */
    public int deleteByPrimaryKey(int itemid);
	
	/**
	 * 新增订单明细
	 * @param record
	 * @return
	 */
    public int insert(Orderitem record);
	
	/**
	 * 查看某一个订单
	 * @param cateid
	 * @return
	 */
	public Orderinfo selectByPrimaryKey(int itemid);
	
	/**
	 * 查看所有订单
	 * @return
	 */
    public List<Orderitem> selectAll();
    
    /**
     * 修改某一个订单
     * @param record
     * @return
     */
    public int updateByPrimaryKey(Orderitem record);
}