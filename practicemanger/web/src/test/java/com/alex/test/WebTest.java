package com.alex.test;

import com.alex.mapper.UserMapper;
import com.alex.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Duthor: Dailm
 * @Date: 2020-01-30 17:14
 * @Descripton:
 * @Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class WebTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public  void addUser(){
        User user = new User();
        user.setUserName("suki2");
        user.setPhone("1366666668");
        userMapper.addUser(user);
    }

    @Test
    public void findAllUser(){
        List<User> allUser = userMapper.findAllUser();
        allUser.stream().forEach(item ->{
            System.out.println(item.toString());
        });


    }

}
