package com.devnotes.redis.service;

import com.devnotes.redis.entity.UserDO;

import java.util.List;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnotes.redis.service
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-10 17:55
 */
public interface IUserService {

    List<UserDO> getLists();

    Integer add(UserDO user);
}
