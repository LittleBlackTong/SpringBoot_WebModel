package com.example.web_model.controller;

import com.alibaba.fastjson.JSON;
import com.example.web_model.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("test")
    public String setRedisValue(){
        stringRedisTemplate.opsForValue().set("value key","test value");
        return stringRedisTemplate.opsForValue().get("value key");
    }

    @RequestMapping("testuser")
    public String setRedisUserValue(){
        UserPojo userPojo=new UserPojo();
        userPojo.setUser_id(1);
        userPojo.setUser_loginid("Crazy");
        userPojo.setUser_phone("17610835620");
        userPojo.setUser_name("桐");
        stringRedisTemplate.opsForValue().set("json:user", JSON.toJSONString(userPojo));
        return stringRedisTemplate.opsForValue().get("json:user");
    }
}
