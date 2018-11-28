package com.dao;

import com.pojo.Categorys;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ICategorysMapper {
	
	/**
	 * 删除分类表
	 * @param cateid
	 * @return
	 */
	@Delete("delete from categorys where cateid=#{cateid}")
    public int deleteByPrimaryKey(int cateid);

	/**
	 * 新增分类表
	 * @param record
	 * @return
	 */
	@Insert("insert into categorys values(seq_cate.nextval,parentid=#{parentid},catename=#{catename},catestatus=#{catestatus},cateorder=#{cateorder},catetime=#{catetime},catelasttime=#{catelasttime})")
	public int insert(Categorys record);

	/**
	 * 查看某一个分类表
	 * @param cateid
	 * @return
	 */
	@Select("select * from categorys where cateid=#{cateid}")
	public Categorys selectByPrimaryKey(int cateid);

	/**
	 * 查看所有分类表
	 * @return
	 */
    @Select("select * from categorys")
	public List<Categorys> selectAll();

    /**
     * 修改某一个分类表
     * @param record
     * @return
     */
    @Update("update categorys set parentid=#{parentid},catename=#{catename},catestatus=#{catestatus},cateorder=#{cateorder},catetime=#{catetime},catelasttime=#{catelasttime} where cateid=#{cateid}")
	public int updateByPrimaryKey(Categorys record);
}