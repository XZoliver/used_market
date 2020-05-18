package com.xzoliver.used_market.serviceimpl;

import com.xzoliver.used_market.dao.UserDao;
import com.xzoliver.used_market.entity.User;
import com.xzoliver.used_market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 创建人：肖易安
 * 创建时间：  2020/5/18
 * 注释：null
 **/
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao ;

    /**
     * 创建人：肖易安
     * 创建时间：  2020/5/18
     * 注释：用户注册
     **/
    @Override
    public int register(User user) {
        return userDao.register(user);
    }
}
