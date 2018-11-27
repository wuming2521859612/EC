package com.dao;

import com.pojo.Cart;
import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Short cartid);

    int insert(Cart record);

    Cart selectByPrimaryKey(Short cartid);

    List<Cart> selectAll();

    int updateByPrimaryKey(Cart record);
}