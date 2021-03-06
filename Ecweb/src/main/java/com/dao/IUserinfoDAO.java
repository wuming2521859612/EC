package com.dao;

import com.pojo.Userinfo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface IUserinfoDAO {
	
	/**
	 * 删除用户
	 * @param userid
	 * @return
	 */
	@Delete("delete from userinfo where userid=#{userid}")
    public int deleteByPrimaryKey(Short userid);

	/**
	 * 新增用户
	 * @param record
	 * @return
	 */
	@Insert("insert into userinfo values(seq_userinfo.nextval,#{username},#{userpwd},#{useremail},#{userphone},#{userquestion},#{useranswer},#{userrole},#{usercreatetime},#{userlasttime})")
	public int insert(Userinfo record);
	
	/**
	 * 查看某一个用户
	 * @param userid
	 * @return
	 */
	@Select("select * from userinfo where userid=#{userid}")
	public Userinfo selectByPrimaryKey(Short userid);

	/**
	 * 查看所有用户
	 * @return
	 */
    @Select("select * from userinfo")
    public List<Userinfo> selectAll();
    
    /**
     * 修改某一个用户
     * @param record
     * @return
     */
    @Update("update userinfo set username=#{username},userpwd=#{userpwd},useremail=#{useremail},userphone=#{userphone},userquestion=#{userquestion},useranswer=#{useranswer},userrole=#{userrole},usercreatetime=#{usercreatetime},userlasttime=#{userlasttime} where userid=#{userid}")
    public int updateByPrimaryKey(Userinfo record);
}