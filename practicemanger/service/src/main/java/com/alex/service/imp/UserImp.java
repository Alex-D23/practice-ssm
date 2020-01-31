package com.alex.service.imp;

import com.alex.mapper.UserMapper;
import com.alex.service.UserService;
import com.alex.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Duthor: Dailm
 * @Date: 2020-01-31 15:25
 * @Descripton:
 * @Version: 1.0
 */
@Service
public class UserImp  implements UserService{

    @Autowired
    UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
