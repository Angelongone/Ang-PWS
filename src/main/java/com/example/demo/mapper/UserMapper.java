package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询用户名和密码
     * @param username
     * @param password
     * @return
     */
    String getPByU(String username,String password);

    /**
     * 添加用户
     * @param username
     * @param password
     * @param name
     */
    void addUser(String username,String password,String name);

    /**
     * 查询用户名是否存在
     * @param username
     * @return
     */
    String reUser(String username);
}
