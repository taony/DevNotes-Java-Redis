/**
 * Copyright(c) 2020 itouch.com.cn All rights reserved.
 */
package com.taony.redismq.mq;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * TODO
 *
 * @author taony
 * @email taonyzhang@gmail.com
 * @date created on 2020-04-13 22:11
 */
@Component
public class Receiver {

    public void receiveMessage(String message) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(LocalDate.now().toString() + " --> Receive: " + message);
    }

}