package com.dao;

import com.pojo.Payinfo;
import java.util.List;

public interface PayinfoMapper {
    int deleteByPrimaryKey(Short payid);

    int insert(Payinfo record);

    Payinfo selectByPrimaryKey(Short payid);

    List<Payinfo> selectAll();

    int updateByPrimaryKey(Payinfo record);
}