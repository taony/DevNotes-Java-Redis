package com.devnotes.redis.service.impl;

import com.devnotes.redis.dao.UserDao;
import com.devnotes.redis.entity.UserDO;
import com.devnotes.redis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnotes.redis.service.impl
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-10 17:56
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Cacheable(value = "user")
    @Override
    public List<UserDO> getLists() {
        System.out.println("打印语句则没有走缓存");
        return userDao.getLists();
    }

    @CacheEvict(value = "user", allEntries = true)//清空缓存，
    @Override
    public Integer add(UserDO user) {
        return userDao.add(user);
    }
}
