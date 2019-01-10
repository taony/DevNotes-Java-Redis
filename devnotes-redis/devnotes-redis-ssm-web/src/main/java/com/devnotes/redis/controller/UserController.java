package com.devnotes.redis.controller;

import com.devnotes.redis.entity.UserDO;
import com.devnotes.redis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnotes.redis.controller
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-10 17:58
 */

@Controller
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/list")
    @ResponseBody
    public List<UserDO> getLists(){
        return userService.getLists();
    }
    @RequestMapping("/add")
    @ResponseBody
    public boolean add(UserDO user){
        return userService.add(user)>0;
    }
}
