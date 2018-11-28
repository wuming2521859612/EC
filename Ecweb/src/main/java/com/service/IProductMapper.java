package com.service;

import com.pojo.Product;

import java.util.List;

public interface IProductMapper {

	/**
	 * 删除商品信息
	 * @param proid
	 * @return
	 */
    public int deleteByPrimaryKey(int proid);

	/**
	 * 新增商品信息
	 * @param record
	 * @return
	 */
	public int insert(Product record);

	/**
	 * 查看某一个商品信息
	 * @param proid
	 * @return
	 */
	public Product selectByPrimaryKey(int proid);

	/**
	 * 查看所有商品信息
	 * @return
	 */
    public List<Product> selectAll();

    /**
     * 修改某一个商品信息
     * @param record
     * @return
     */
    public int updateByPrimaryKey(Product record);
}