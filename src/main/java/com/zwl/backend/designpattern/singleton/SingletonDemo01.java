package com.zwl.backend.designpattern.singleton;

/**
 * @author zwl
 * @date 2021/7/20 14:57
 * @describe 单例模式-饿汉...
 */
public class SingletonDemo01 {

    private static final SingletonDemo01 instance = new SingletonDemo01();
    private SingletonDemo01() {
    }
    public static SingletonDemo01 getInstance() {
        return instance;
    }

}

class SingletonDemo02{
    private static  SingletonDemo02 instance;

    private SingletonDemo02() {
    }
    static {
        instance=new SingletonDemo02();
    }

    public static SingletonDemo02 getInstance() {
        return instance;
    }
}
