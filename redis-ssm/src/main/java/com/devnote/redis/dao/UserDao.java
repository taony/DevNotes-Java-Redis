package com.devnote.redis.dao;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnote.redis.dao
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-17 00:21
 */

import com.devnote.redis.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getLists();

    Integer add(User user);
}
