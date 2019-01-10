package com.devnotes.redis.dao;

import com.devnotes.redis.entity.UserDO;

import java.util.List;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnotes.redis.dao
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-10 17:53
 */
public interface UserDao {

    List<UserDO> getLists();

    Integer add(UserDO user);
}
