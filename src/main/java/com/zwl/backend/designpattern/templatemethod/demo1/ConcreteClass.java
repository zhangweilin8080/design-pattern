package com.zwl.backend.designpattern.templatemethod.demo1;

/**
 * @author zwl
 * @date 2021/9/7 14:37
 * @describe instructions...
 */
public class ConcreteClass extends AbstractClass {
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
