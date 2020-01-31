package com.alex.mapper;

import com.alex.user.User;

import java.util.List;

/**
 * @Duthor: Dailm
 * @Date: 2020-01-30 14:57
 * @Descripton:
 * @Version: 1.0
 */
public interface UserMapper {
    void addUser(User user);
    List<User> findAllUser();

}
