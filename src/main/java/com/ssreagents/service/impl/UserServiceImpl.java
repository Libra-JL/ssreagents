package com.ssreagents.service.impl;


import com.ssreagents.dao.UserDao;
import com.ssreagents.dao.impl.UserDaoImpl;
import com.ssreagents.pojo.User;
import com.ssreagents.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserbyUserNameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryUserbyUserName(username) == null) {

            return false;
        }
        return true;
    }
}
