package com.shopping.dao;

import com.shopping.domain.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {

    User selectUser(int id);

    User checkUser(@Param(value = "username")String username,@Param(value = "password")String password);
}
