package com.example.fangspringboot.service.impl;

import com.example.fangspringboot.dal.UserModelMapper;
import com.example.fangspringboot.model.UserModel;
import com.example.fangspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: liupeng
 * @DateTime: Created in 2020/12/10 20:58
 * @version: 1.0
 * @Description: TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;

    @Override
    public UserModel getUser(int id) {
       return userModelMapper.selectByPrimaryKey(id);
    }
}
