package com.dao;

import com.pojo.Address;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IAddressDAO {
	
	/**
	 * 删除地址
	 * @param addid
	 * @return
	 */
	@Delete("delete from address where addid=#{addid}")
    public int deleteByPrimaryKey(int addid);

	/**
	 * 新增地址
	 * @param record
	 * @return
	 */
	@Insert("insert into address values(seq_address.nextval,#{userid},#{addname},#{addphone},#{addmobile},#{addprovince},#{addcity},#{adddistict},#{addaddress},#{addzip},#{addcreatetime},#{addlasttime})")
	public int insert(Address record);

	/**
	 * 查看某一个用户的地址
	 * @param addid
	 * @return
	 */
	@Select("select * from address where addid=#{addid}")
	public Address selectByPrimaryKey(int addid);

	/**
	 * 查看所有地址
	 * @return
	 */
    @Select("select * from address")
    public List<Address> selectAll();

    /**
     * 修改某一个用户的地址
     * @param record
     * @return
     */
    @Update("update address set userid=#{userid},addname=#{addname},addphone=#{addphone},addmobile=#{addmobile},addprovince=#{addprovince},addcity=#{addcity},adddistict=#{adddistict},addaddress=#{addaddress},addzip=#{addzip},addcreatetime=#{addcreatetime},addlasttime=#{addlasttime} where addid=#{addid}")
    public int updateByPrimaryKey(Address record);
}