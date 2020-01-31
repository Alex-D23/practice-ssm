package com.alex.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Duthor: Dailm
 * @Date: 2020-01-31 16:05
 * @Descripton:
 * @Version: 1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
