package com.xzoliver.used_market.service;

import com.xzoliver.used_market.entity.Goods;
import com.xzoliver.used_market.entity.Users;
import com.xzoliver.used_market.entity.UsersExample;

import java.util.List;

/**
 * 创建人：肖易安
 * 创建时间：  2020/5/18
 * 注释：nulls
 **/
public interface UserService {
    int register(Users user);

    boolean login(String username, String password);

    List<Goods> getAllGoods();

    Users userHome(Integer id);

    Goods goodView(Integer id);

}
