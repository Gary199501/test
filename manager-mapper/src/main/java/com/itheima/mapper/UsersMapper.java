package com.itheima.mapper;

import com.itheima.pojo.Users;

import java.util.List;

/**
 * @Description: com.itheima.mapper
 * @Author GARY
 * @Version V1.0.0
 * @Date 2020/5/12
 */
public interface UsersMapper {
    /**
     * 添加用户
     * @param users
     */
    void insertUser(Users users);

    /**
     * 查询所有用户
     * @return  List<Users>
     */
    List<Users> selectUserAll();
}
