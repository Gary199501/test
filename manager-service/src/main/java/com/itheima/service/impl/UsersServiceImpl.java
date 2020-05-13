package com.itheima.service.impl;

import com.itheima.mapper.UsersMapper;
import com.itheima.pojo.Users;
import com.itheima.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: com.itheima.service.impl
 * @Author GARY
 * @Version V1.0.0
 * @Date 2020/5/12
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
