package com.gmail.vitali.malatok.java;

import com.gmail.vitali.malatok.java.service.Impl.RunTaskServiceImpl;
import com.gmail.vitali.malatok.java.service.RunTaskService;

public class FirstTask {
    public static void main(String[] args) {
        RunTaskService runTask = new RunTaskServiceImpl();
        runTask.runTaskService();
    }
}