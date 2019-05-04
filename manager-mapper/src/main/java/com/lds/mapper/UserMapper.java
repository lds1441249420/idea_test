package com.lds.mapper;

import com.lds.pojo.User;

import java.util.List;

/**
 * @Auther:LDS
 * @Date:2019/4/26
 * @Description:com.lds.mapper
 * @version:1.0
 */
public interface UserMapper {
    // 新增用户
    void insertUser(User user);
    // 查询所有用户
    List<User> selectUserAll();
}
