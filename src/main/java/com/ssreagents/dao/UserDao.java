package com.ssreagents.dao;

import com.ssreagents.pojo.User;

/**
 * @author Libra
 */
public interface UserDao {
    /**
     *
     * @param email
     * @return
     */
    public User queryUserbyEmail(String email);

    public int saveUser(User user);

    public User queryUserbyEmailAndPassword(String username,String password);
}
