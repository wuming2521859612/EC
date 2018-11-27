package com.dao;

import com.pojo.Categorys;
import java.util.List;

public interface CategorysMapper {
    int deleteByPrimaryKey(Short cateid);

    int insert(Categorys record);

    Categorys selectByPrimaryKey(Short cateid);

    List<Categorys> selectAll();

    int updateByPrimaryKey(Categorys record);
}