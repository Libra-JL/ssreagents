package com.ssreagents.dao.impl;

import com.ssreagents.dao.UserDao;
import com.ssreagents.pojo.User;

/**
 * @author Libra
 */
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryUserbyEmail(String email) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where email = ?";
        return queryForOne(User.class, sql, email);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(username,password,email,phone_num,school,college,identity,pi_name,student_name) values(?,?,?,?,?,?,?,?,?)";

        return upadate(sql, user.getUsername(), user.getPassword(), user.getEmail(),user.getPhone_num()
                ,user.getSchool(), user.getCollege(),user.getIdentity(),user.getPi_name(),user.getStudent_name());
    }

    @Override
    public User queryUserbyEmailAndPassword(String email, String password) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where email = ? and password = ?";
        return queryForOne(User.class, sql, email, password);
    }
}
