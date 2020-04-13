/**
 * Copyright(c) 2020 itouch.com.cn All rights reserved.
 */
package com.taony.redismq;

import com.taony.redismq.mq.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.IdGenerator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * TODO
 *
 * @author taony
 * @email taonyzhang@gmail.com
 * @date created on 2020-04-13 16:51
 */
@RestController
public class PushController {

    @Autowired
    private SendService sendService;

    @Resource
    RedisTemplate redisTemplate;

    @RequestMapping("/send/")
    @ResponseBody
    public String sendMessage() {
        String message = UUID.randomUUID().toString();
        sendService.sendMessage(message);
        return message;
    }

}
