package com.example.web_model.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class TimeTask {
    @Scheduled(fixedRate = 3000)
    public void getTimeTask(){
        System.out.println("fixedRate"+new Date());
    }

    @Scheduled(cron = "0 1/1 * * * ?" )
    public void getCronTask(){
        System.out.println("cronTask:"+new Date());
    }
}
