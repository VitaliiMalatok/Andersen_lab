package com.gmail.vitali.malatok.java;

import com.gmail.vitali.malatok.java.service.Impl.RunTaskServiceImpl;
import com.gmail.vitali.malatok.java.service.RunTaskService;

public class Main {
    public static void main(String[] args) {
        RunTaskService runTask = new RunTaskServiceImpl();
        runTask.runTaskService();
    }
}