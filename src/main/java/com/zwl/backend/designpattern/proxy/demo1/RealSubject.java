package com.zwl.backend.designpattern.proxy.demo1;

/**
 * @author zwl
 * @date 2021/8/11 14:48
 * @describe 真实主题...
 */
public class RealSubject implements Subject {
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}