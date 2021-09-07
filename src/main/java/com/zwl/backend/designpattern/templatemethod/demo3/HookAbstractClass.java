package com.zwl.backend.designpattern.templatemethod.demo3;

/**
 * @author zwl
 * @date 2021/9/7 14:42
 * @describe instructions...
 */
public abstract class HookAbstractClass {
    //模板方法
    public void TemplateMethod() {
        abstractMethod1();
        HookMethod1();
        if (HookMethod2()) {
            SpecificMethod();
        }
        abstractMethod2();
    }
    //具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    //钩子方法1
    public void HookMethod1() {
    }
    //钩子方法2
    public boolean HookMethod2() {
        return true;
    }
    //抽象方法1
    public abstract void abstractMethod1();
    //抽象方法2
    public abstract void abstractMethod2();
}
