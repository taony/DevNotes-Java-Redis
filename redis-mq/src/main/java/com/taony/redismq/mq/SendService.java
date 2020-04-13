/**
 * Copyright(c) 2020 itouch.com.cn All rights reserved.
 */
package com.taony.redismq.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author taony
 * @email taonyzhang@gmail.com
 * @date created on 2020-04-13 22:11
 */

@Service
public class SendService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void sendMessage(String message){
        try {
            stringRedisTemplate.convertAndSend("myChannel", message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}