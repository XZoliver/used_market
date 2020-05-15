package com.xzoliver.used_market.dao;

import com.xzoliver.used_market.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 *创建人：肖易安
 *创建时间：2020/5/15
 **/
@Mapper
public interface DemoDao {
    @Select("select * from user where id=#{id}")
    User userInfo(int id);
}
