package com.ssreagents.service;

import com.ssreagents.pojo.User;

public interface UserService {
    public void registUser(User user);

    public User login(User user);


    /**
     * 检查用户名是否可用
     * @param email
     * @return 返回true表示用户名存在
     */
    public boolean existsEmail(String email);
}
