package com.zwl.backend.designpattern.bridge.demo1;

/**
 * @author zwl
 * @date 2021/8/12 9:30
 * @describe 扩展抽象化角色...
 */
public class  RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.OperationImpl();
    }
}