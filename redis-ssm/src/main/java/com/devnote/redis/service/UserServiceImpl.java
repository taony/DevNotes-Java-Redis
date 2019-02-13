package com.devnote.redis.service;

import com.devnote.redis.dao.UserDao;
import com.devnote.redis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnote.redis.service
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-17 00:23
 */
@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    private UserDao userDao;

    @Cacheable(value="user")
    @Override
    public List<User> getLists() {
        System.out.println("打印语句则没有走缓存");
        return userDao.getLists();
    }

    @CacheEvict(value= "user",allEntries=true)//清空缓存，
    @Override
    public Integer add(User user) {

        return userDao.add(user);
    }
}

