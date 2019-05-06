package com.github.siilas.service;

import com.github.siilas.interceptor.LogInterceptor;
import net.sf.cglib.proxy.Enhancer;

public class LogService {

    public static LogService newInstace() {
        LogInterceptor interceptor = new LogInterceptor();
        LogService service = (LogService) Enhancer.create(LogService.class, interceptor);
        return service;
    }

    public void helloWorld() {
        System.out.println("Hello World!");
    }

}
