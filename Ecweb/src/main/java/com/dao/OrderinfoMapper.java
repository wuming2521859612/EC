package com.dao;

import com.pojo.Orderinfo;
import java.util.List;

public interface OrderinfoMapper {
    int deleteByPrimaryKey(Short orderid);

    int insert(Orderinfo record);

    Orderinfo selectByPrimaryKey(Short orderid);

    List<Orderinfo> selectAll();

    int updateByPrimaryKey(Orderinfo record);
}