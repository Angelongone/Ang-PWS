package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    /**
     * 查询所以用户
     * @return
     */
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

    /**
     * 查询指定用户的密码
     * @param username
     * @param password
     * @return
     */
    public String getPByU(String username,String password){
        return userMapper.getPByU(username,password);
    }

    /**
     * 添加用户
     * @param username
     * @param password
     * @param name
     */
    public void addUser(String username,String password,String name){
        userMapper.addUser(username,password,name);
    }

    /**
     * 查询用户的name
     * @param username
     * @return
     */
    public String reUser(String username){
        return userMapper.reUser(username);
    }
}
