package com.lds.test;

import com.lds.mapper.UserMapper;
import com.lds.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther:LDS
 * @Date:2019/4/26
 * @Description:com.lds.test
 * @version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest(){
        User user = new User();
        user.setUsername("admin");
        user.setUserage(15);
        this.userMapper.insertUser(user);
    }
}
