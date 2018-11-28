package com.service;

import com.pojo.Cart;

import java.util.List;

public interface ICartMapper {
	
	/**
	 * 删除购物车中某一个商品
	 * @param cartid
	 * @return
	 */
	public int deleteByPrimaryKey(int cartid);

	/**
	 * 新增商品到购物车
	 * @param record
	 * @return
	 */
	public int insert(Cart record);

	/**
	 * 查看某一个用户的地址
	 * @param addid
	 * @return
	 */
	public Cart selectByPrimaryKey(int cartid);

	/**
	 * 查看所有地址
	 * @return
	 */
	public List<Cart> selectAll();

    /**
     * 修改某一个用户的地址
     * @param record
     * @return
     */
	public int updateByPrimaryKey(Cart record);
}