package com.dao;

import com.pojo.Cart;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ICartMapper {
	
	/**
	 * 删除购物车中某一个商品
	 * @param cartid
	 * @return
	 */
	@Delete("delete from cart where cartid=#{cartid}")
	public int deleteByPrimaryKey(int cartid);

	/**
	 * 新增商品到购物车
	 * @param record
	 * @return
	 */
	@Insert("insert into cart values(seq_cart.nextval,proid=#{proid},cartquantity=#{cartquantity},cartchecked=#{cartchecked},cartcreatetime=#{cartcreatetime},cartlasttime=#{cartlasttime})")
	public int insert(Cart record);

	/**
	 * 查看某一个用户的地址
	 * @param addid
	 * @return
	 */
	@Select("select * from cart where addid=#{addid}")
	public Cart selectByPrimaryKey(int cartid);

	/**
	 * 查看所有地址
	 * @return
	 */
    @Select("select * from cart")
	public List<Cart> selectAll();

    /**
     * 修改某一个用户的地址
     * @param record
     * @return
     */
    @Update("update cart set proid=#{proid},cartquantity=#{cartquantity},cartchecked=#{cartchecked},cartcreatetime=#{cartcreatetime},cartlasttime=#{cartlasttime} where cartid=#{cartid}")
	public int updateByPrimaryKey(Cart record);
}