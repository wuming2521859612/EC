package com.service;

import com.pojo.Categorys;

import java.util.List;

public interface ICategorysMapper {
	
	/**
	 * 删除分类表
	 * @param cateid
	 * @return
	 */
    public int deleteByPrimaryKey(int cateid);

	/**
	 * 新增分类表
	 * @param record
	 * @return
	 */
	public int insert(Categorys record);

	/**
	 * 查看某一个分类表
	 * @param cateid
	 * @return
	 */
	public Categorys selectByPrimaryKey(int cateid);

	/**
	 * 查看所有分类表
	 * @return
	 */
	public List<Categorys> selectAll();

    /**
     * 修改某一个分类表
     * @param record
     * @return
     */
	public int updateByPrimaryKey(Categorys record);
}