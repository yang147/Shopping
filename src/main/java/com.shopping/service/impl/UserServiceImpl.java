package com.shopping.service.impl;

import com.shopping.dao.IUserDao;
import com.shopping.domain.User;
import com.shopping.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(int userId) {
        return this.userDao.selectUser(userId);
    }

    @Override
    public User checkUser(String username, String password) {
        return this.userDao.checkUser(username,password);
    }
}
