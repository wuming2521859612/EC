package com.dao;

import com.pojo.Payinfo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IPayinfoDAO {
	
	/**
	 * 删除支付信息
	 * @param payid
	 * @return
	 */
	@Delete("delete from payinfo where payid=#{payid}")
	public int deleteByPrimaryKey(int payid);

	/**
	 * 新增支付信息
	 * @param record
	 * @return
	 */
	@Insert("insert into payinfo values(seq_payinfo.nextval,#{payorder},#{payplatform},#{platformnumber},#{platformstatus},#{paytime},#{paylasttime})")
	public int insert(Payinfo record);

	/**
	 * 查看某一个支付信息
	 * @param payid
	 * @return
	 */
	@Select("select * from payinfo where payid=#{payid}")
	public Payinfo selectByPrimaryKey(int payid);

	/**
	 * 查看所有支付信息
	 * @return
	 */
    @Select("select * from payinfo")
    public List<Payinfo> selectAll();

    /**
     * 修改某一个支付信息
     * @param record
     * @return
     */
    @Update("update payinfo set payorder=#{payorder},payplatform=#{payplatform},platformnumber=#{platformnumber},platformstatus=#{platformstatus},paytime=#{paytime},paylasttime=#{paylasttime} where payid=#{payid}")
    public int updateByPrimaryKey(Payinfo record);
}