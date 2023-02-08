package com.taskSchedular.task.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskSchedular {
@Scheduled(fixedRate =3000 )
    public void invokeTask(){
    System.out.println("Task Executing");

    }
}
