package com.cuiwz.dao;

import com.cuiwz.entity.User;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有用户，同时获取到用户下所有账户的信息
     * @return
     */
    List<User> findAll();

}
