package com.dao;

import com.pojo.Orderinfo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IOrderinfoMapper {
	/**
	 * 删除订单
	 * @param orderid
	 * @return
	 */
	@Delete("delete from orderinfo where orderid=#{orderid}")
    public int deleteByPrimaryKey(int orderid);

	/**
	 * 新增订单
	 * @param record
	 * @return
	 */
	@Insert("insert into orderinfo values(seq_orderinfo.nextval,payorder=#{payorder},userid=#{userid},proid=#{proid},payment=#{payment},paymenttype=#{paymenttype},paypostage=#{paypostage},paystatus=#{paystatus},paymenttime=#{paymenttime},paysendtime=#{paysendtime},payendtime=#{payendtime},payclosetime=#{payclosetime},paycreatetime=#{paycreatetime},paylasttime=#{paylasttime})")
	public int insert(Orderinfo record);

	/**
	 * 查看某一个订单
	 * @param cateid
	 * @return
	 */
	@Select("select * from orderinfo where cateid=#{cateid}")
	public Orderinfo selectByPrimaryKey(int orderid);

	/**
	 * 查看所有订单
	 * @return
	 */
    @Select("select * from orderinfo")
    public List<Orderinfo> selectAll();

    /**
     * 修改某一个订单
     * @param record
     * @return
     */
    @Update("update orderinfo set payorder=#{payorder},userid=#{userid},proid=#{proid},payment=#{payment},paymenttype=#{paymenttype},paypostage=#{paypostage},paystatus=#{paystatus},paymenttime=#{paymenttime},paysendtime=#{paysendtime},payendtime=#{payendtime},payclosetime=#{payclosetime},paycreatetime=#{paycreatetime},paylasttime=#{paylasttime} where orderid=#{orderid}")
    public int updateByPrimaryKey(Orderinfo record);
}