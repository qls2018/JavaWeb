package com.atguigu.service;

import com.atguigu.pojo.User;

/**
 * @auther qq
 * @creat 2020-08-17-10:30
 */
public interface UserService {

    /**
     * 注册用户
     * @param user
     */
    public void regiserUser(User user);

    /**
     * 登陆
     * @param user
     * @return 如果返回null，说明登陆失败，返回有值，是登陆成功。
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return 返回true表示用户名已存在，返回false表示用户ing不存在。
     */
    public boolean existsUsername(String username);
}
