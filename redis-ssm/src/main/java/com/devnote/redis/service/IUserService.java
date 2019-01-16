package com.devnote.redis.service;

import com.devnote.redis.entity.User;

import java.util.List;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnote.redis.service
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-17 00:23
 */
public interface IUserService {
    List<User> getLists();
    Integer add(User user);

}
