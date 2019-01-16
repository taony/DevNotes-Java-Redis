package com.devnote.redis.controller;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnote.redis.controller
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-17 00:25
 */
import com.devnote.redis.entity.User;
import com.devnote.redis.service.IUserService;
import com.github.jsonzou.jmockdata.JMockData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;


@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/list")
    public List<User> getLists(){
        return userService.getLists();
    }

    @RequestMapping("/add")
    @ResponseBody
    public boolean add(User user){
        user.setAge(18);
        user.setName(UUID.randomUUID().toString());
        user.setSex("男");
        return userService.add(user)>0;
    }
}