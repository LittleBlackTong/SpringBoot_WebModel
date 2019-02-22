package com.example.web_model.controller;

import com.example.web_model.util.AnsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Future;

@Controller
public class AnsyncController {
    @Autowired
    private AnsyncTask ansyncTask;
    @RequestMapping("ansync")
    @ResponseBody
    public String  ansyncTest() throws Exception {
        long start=System.currentTimeMillis();
        Future<Boolean> a=ansyncTask.task1();
        Future<Boolean> b=ansyncTask.task2();
        Future<Boolean> c=ansyncTask.task3();
        while(!a.isDone()||!b.isDone()||!c.isDone()){
            if(a.isDone()&&b.isDone()&&c.isDone()){
                break;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("全部用时:"+(end-start)+"毫秒");
        return "success";
    }
}
