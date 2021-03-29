package com.ssreagents.dao;

import com.ssreagents.pojo.User;

public interface UserDao {

    public User queryUserbyUserName(String username);

    public int saveUser(User user);

    public User queryUserbyUserNameAndPassword(String username,String password);
}
