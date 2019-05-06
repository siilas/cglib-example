package com.github.siilas.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogInterceptor implements MethodInterceptor {

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before method...");
        Object invokedMethod = methodProxy.invokeSuper(object, args);
        System.out.println("After method...");
        return invokedMethod;
    }

}
