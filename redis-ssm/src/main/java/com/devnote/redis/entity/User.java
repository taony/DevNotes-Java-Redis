package com.devnote.redis.entity;

import java.io.Serializable;

/**
 * @desc: TODO
 * @title: null.java
 * @package com.devnote.redis.entity
 * @auther: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-01-17 00:20
 */
public class User implements Serializable {//如果不实现Serializable接口会报错
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
