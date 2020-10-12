package com.atguigu.dao;

import com.atguigu.pojo.User;

/**
 * @auther qq
 * @creat 2020-08-13-17:20
 */
public interface UserDao {





    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User queryUserByUsername(String username);



    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return
     */
    public User queryUserByUsernameAndPassword(String username,String password);

    /**
     * 保存用户信息
     * @param user
     * @return 返回-1表示操作失败，其他是sql语句影响的行数。
     */
    public int saveUser(User user);


}
