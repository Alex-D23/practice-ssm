package com.alex.web.controller;

import com.alex.service.UserService;
import com.alex.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Duthor: Dailm
 * @Date: 2020-01-31 15:28
 * @Descripton:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserCtrol {

    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    String addUser(User user){
        userService.addUser(user);
        return "index";
    }
}
