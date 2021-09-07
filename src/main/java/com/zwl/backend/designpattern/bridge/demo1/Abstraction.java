package com.zwl.backend.designpattern.bridge.demo1;

/**
 * @author zwl
 * @date 2021/8/12 9:29
 * @describe 抽象化角色...
 */
public abstract class Abstraction {
    protected Implementor imple;
    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }
    public abstract void Operation();
}