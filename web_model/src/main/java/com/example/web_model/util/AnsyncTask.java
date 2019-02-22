package com.example.web_model.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class AnsyncTask {
    @Async
    public Future<Boolean> task1() throws Exception{
        long start=System.currentTimeMillis();
        Thread.sleep(1000);
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }
    @Async
    public Future<Boolean> task2() throws Exception{
        long start=System.currentTimeMillis();
        Thread.sleep(500);
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }
    @Async
    public Future<Boolean> task3() throws Exception{
        long start=System.currentTimeMillis();
        Thread.sleep(400);
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }
}
