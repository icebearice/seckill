package com.seckill.project.service;

import com.seckill.project.error.BusinessException;
import com.seckill.project.service.model.UserModel;

public interface UserService  {
    // 通过用户 Id 获取用户对象的方法
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;

    /**
     *
     * @param telephone 用户注册手机
     * @param encrptPassword  用户加密过的密码
     * @throws BusinessException
     */
    UserModel validateLogin(String telephone, String encrptPassword) throws BusinessException;
}
