package com.zwl.backend.designpattern.templatemethod.demo3;

/**
 * @author zwl
 * @date 2021/9/7 14:42
 * @describe 含钩子方法的具体子类...
 */
public class HookConcreteClass extends HookAbstractClass {
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
    public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }
    public boolean HookMethod2() {
        return false;
    }
}