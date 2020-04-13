/**
 * Copyright(c) 2020 itouch.com.cn All rights reserved.
 */
package com.taony.redismq.mq;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * TODO
 *
 * @author taony
 * @email taonyzhang@gmail.com
 * @date created on 2020-04-13 22:12
 */
@Configuration
@AutoConfigureAfter({Receiver.class})
public class SubscriberConfig {

    /**
     * 注入消息监听适配器
     */
    @Bean
    public MessageListenerAdapter getMessageListenerAdapter(Receiver receiver){
        return new MessageListenerAdapter(receiver, "receiveMessage");
    }

    /**
     * 注入消息监听容器
     */
    @Bean
    public RedisMessageListenerContainer getRedisMessageListenerContainer(
            RedisConnectionFactory redisConnectionFactory, MessageListenerAdapter messageListenerAdapter){
        RedisMessageListenerContainer redisMessageListenerContainer = new RedisMessageListenerContainer();

        redisMessageListenerContainer.setConnectionFactory(redisConnectionFactory);
        redisMessageListenerContainer.addMessageListener(messageListenerAdapter, new PatternTopic("myChannel"));

        return redisMessageListenerContainer;
    }

}