package com.dao;

import com.pojo.Userinfo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface IUserinfoMapper {
	
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
	@Insert("insert into userinfo values(seq_userinfo.nextval,username=#{username},userpwd=#{userpwd},useremail=#{useremail},userphone=#{userphone},userquestion=#{userquestion},useranswer=#{useranswer},userrole=#{userrole},usercreatetime=#{usercreatetime},userlasttime=#{userlasttime})")
	public int insert(Userinfo record);
	
	/**
	 * 查看某一个用户
	 * @param userid
	 * @return
	 */
	@Select("select * from userinfo where userid=#{userid}")
	public Userinfo selectByPrimaryKey(int userid);

	/**
	 * 查看 登录用户
	 * @return
	 */
    @Select("select * from userinfo where username=#{nameOremail} or useremail=#{nameOremail} and userpwd=#{userpwd}")
    public Userinfo selectuser(String nameOremail,String userpwd);
    
    /**
     * 修改某一个用户
     * @param record
     * @return
     */
    @Update("update userinfo set username=#{username},userpwd=#{userpwd},useremail=#{useremail},userphone=#{userphone},userquestion=#{userquestion},useranswer=#{useranswer},userrole=#{userrole},usercreatetime=#{usercreatetime},userlasttime=#{userlasttime} where userid=#{userid}")
    public int updateByPrimaryKey(Userinfo record);
}