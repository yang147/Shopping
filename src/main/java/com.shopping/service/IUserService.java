package com.shopping.service;

import com.shopping.domain.User;

public interface IUserService {

    public User selectUser(int userId);

    public User checkUser(String username,String password);
}
