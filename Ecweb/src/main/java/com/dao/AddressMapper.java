package com.dao;

import com.pojo.Address;
import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Short addid);

    int insert(Address record);

    Address selectByPrimaryKey(Short addid);

    List<Address> selectAll();

    int updateByPrimaryKey(Address record);
}