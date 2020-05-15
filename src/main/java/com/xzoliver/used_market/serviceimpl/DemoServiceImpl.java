package com.xzoliver.used_market.serviceimpl;

import com.xzoliver.used_market.dao.DemoDao;
import com.xzoliver.used_market.entity.User;
import com.xzoliver.used_market.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *创建人：肖易安
 *创建时间：2020/5/15
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao ;
    @Override
    public User userInfo(int id) {
        return demoDao.userInfo(id);
    }
}
