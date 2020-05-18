package com.xzoliver.used_market.dao;

import com.xzoliver.used_market.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * 创建人：肖易安
 * 创建时间：  2020/5/18
 * 注释：null
 **/
@Mapper
public interface UserDao {
    @Insert("insert into users (phone,username,password) values (#{phone},#{username},#{password}")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int register(User user);
}
