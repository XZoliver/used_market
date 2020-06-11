package com.xzoliver.used_market.serviceimpl;

import com.xzoliver.used_market.dao.GoodsDao;
import com.xzoliver.used_market.dao.UsersDao;
import com.xzoliver.used_market.entity.Goods;
import com.xzoliver.used_market.entity.GoodsExample;
import com.xzoliver.used_market.entity.Users;
import com.xzoliver.used_market.entity.UsersExample;
import com.xzoliver.used_market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 创建人：肖易安
 * 创建时间：  2020/5/18
 * 注释：null
 **/
public class UserServiceImpl implements UserService {
    private UsersDao usersDao;
    private GoodsDao goodsDao;

    @Autowired
    public UserServiceImpl(UsersDao usersDao, GoodsDao goodsDao) {
        this.usersDao = usersDao;
        this.goodsDao = goodsDao;
    }


    /**
     * 创建人：肖易安
     * 创建时间：  2020/5/18
     * 注释：用户注册
     **/
    @Override
    public int register(Users user) {
        return usersDao.insert(user);
    }

    @Override
    public boolean login(String username, String password) {
        UsersExample example = new UsersExample();
        example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<Users> usersList = usersDao.selectByExample(example);
        if (usersList.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Goods> getAllGoods() {
        GoodsExample example = new GoodsExample();
        example.createCriteria().andIdIsNotNull();
        List<Goods> goods = goodsDao.selectByExample(example);
        return goods;
    }

    @Override
    public Users userHome(Integer id) {
        UsersExample example = new UsersExample();
        example.createCriteria().andIdEqualTo(id);
        List<Users> users = usersDao.selectByExample(example);
        if (users.size() == 1) {
            return users.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Goods goodView(Integer id) {
        GoodsExample example = new GoodsExample();
        example.createCriteria().andIdEqualTo(id);
        List<Goods> goods = goodsDao.selectByExample(example);
        if (goods.size() == 1) {
            return goods.get(0);
        } else {
            return null;
        }
    }
}
