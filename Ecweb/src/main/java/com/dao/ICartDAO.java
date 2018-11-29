package com.dao;

import com.pojo.Cart;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ICartDAO {
	
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
	@Insert("insert into cart values(seq_cart.nextval,#{proid},#{cartquantity},#{cartchecked},#{cartcreatetime},#{cartlasttime},#{userid})")
	public int insert(Cart record);

	/**
	 * 查看购物车里面某一个商品信息
	 * @param cartid
	 * @return
	 */
	@Select("select * from cart where cartid=#{cartid}")
	public Cart selectByPrimaryKey(int cartid);

	/**
	 * 查看用户购物车的信息
	 * @return
	 */
    @Select("select * from cart where userid=#{userid}")
	public List<Cart> selectAll(int userid);

    /**
     * 修改用户的购物车里面的信息
     * @param record
     * @return
     */
    @Update("update cart set proid=#{proid},cartquantity=#{cartquantity},cartchecked=#{cartchecked},cartcreatetime=#{cartcreatetime},cartlasttime=#{cartlasttime} where cartid=#{cartid}")
	public int updateByPrimaryKey(Cart record);
}