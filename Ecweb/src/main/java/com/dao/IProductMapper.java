package com.dao;

import com.pojo.Product;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IProductMapper {

	/**
	 * 删除商品信息
	 * @param proid
	 * @return
	 */
	@Delete("delete from product where proid=#{proid}")
    public int deleteByPrimaryKey(int proid);

	/**
	 * 新增商品信息
	 * @param record
	 * @return
	 */
	@Insert("insert into product values(seq_product.nextval,cateid=#{cateid},proname=#{proname},prosubtitle=#{prosubtitle},proimage=#{proimage},prodetail=#{prodetail},proprice=#{proprice},prostock=#{prostock},prostatus=#{prostatus},procreatetime=#{procreatetime},prolasttime=#{prolasttime})")
	public int insert(Product record);

	/**
	 * 查看某一个商品信息
	 * @param proid
	 * @return
	 */
	@Select("select * from product where proid=#{proid}")
	public Product selectByPrimaryKey(int proid);

	/**
	 * 查看所有商品信息
	 * @return
	 */
    @Select("select * from product")
    public List<Product> selectAll();

    /**
     * 修改某一个商品信息
     * @param record
     * @return
     */
    @Update("update product set cateid=#{cateid},proname=#{proname},prosubtitle=#{prosubtitle},proimage=#{proimage},prodetail=#{prodetail},proprice=#{proprice},prostock=#{prostock},prostatus=#{prostatus},procreatetime=#{procreatetime},prolasttime=#{prolasttime} where proid=#{proid}")
    public int updateByPrimaryKey(Product record);
}