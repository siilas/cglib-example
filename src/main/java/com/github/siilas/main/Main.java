package com.github.siilas.main;

import com.github.siilas.service.LogService;

public class Main {

    public static void main(String[] args) {
        LogService service = LogService.newInstace();
        service.helloWorld();
    }

}
