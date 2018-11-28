package com.dao;

import com.pojo.Orderinfo;
import com.pojo.Orderitem;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IOrderitemMapper {
	
	/**
	 * 删除订单明细
	 * @param itemid
	 * @return
	 */
	@Delete("delete from orderitem where itemid=#{itemid}")
    public int deleteByPrimaryKey(int itemid);
	
	/**
	 * 新增订单明细
	 * @param record
	 * @return
	 */
	@Insert("insert into orderitem values(seq_orderitem.nextval,userid=#{userid},payorder=#{payorder},proid=#{proid},proname=#{proname},proimage=#{proimage},payment=#{payment},payquantity=#{payquantity},paytotalprice=#{paytotalprice},paycreatetime=#{paycreatetime},paylasttime=#{paylasttime})")
    public int insert(Orderitem record);
	
	/**
	 * 查看某一个订单
	 * @param cateid
	 * @return
	 */
	@Select("select * from orderitem where itemid=#{itemid}")
	public Orderinfo selectByPrimaryKey(int itemid);
	
	/**
	 * 查看所有订单
	 * @return
	 */
    @Select("select * from orderitem")
    public List<Orderitem> selectAll();
    
    /**
     * 修改某一个订单
     * @param record
     * @return
     */
    @Update("update orderitem set userid=#{userid},payorder=#{payorder},proid=#{proid},proname=#{proname},proimage=#{proimage},payment=#{payment},payquantity=#{payquantity},paytotalprice=#{paytotalprice},paycreatetime=#{paycreatetime},paylasttime=#{paylasttime} where itemid=#{itemid}")
    public int updateByPrimaryKey(Orderitem record);
}