package com.dao;

import com.pojo.Orderitem;
import java.util.List;

public interface OrderitemMapper {
    int insert(Orderitem record);

    List<Orderitem> selectAll();
}