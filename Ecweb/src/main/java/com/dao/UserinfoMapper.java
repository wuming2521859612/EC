package com.dao;

import com.pojo.Userinfo;
import java.util.List;

public interface UserinfoMapper {
    public int addUserinfo(Userinfo user);
    
    public int delUserinfo(String userid);
    
    public List<Userinfo> queryAllUserinfo();
    
    public Userinfo queryOneUserinfo(String userid);
    
    public int updUserinfo(Userinfo user);
}