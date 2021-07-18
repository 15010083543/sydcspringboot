package com.example.fangspringboot.service;

import com.example.fangspringboot.model.UserModel;

/**
 * @Author: liupeng
 * @DateTime: Created in 2020/12/10 20:58
 * @version: 1.0
 * @Description: TODO
 */
public interface UserService {

    UserModel getUser(int id);
}
