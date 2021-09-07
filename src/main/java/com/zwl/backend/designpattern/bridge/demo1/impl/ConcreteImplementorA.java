package com.zwl.backend.designpattern.bridge.demo1.impl;

import com.zwl.backend.designpattern.bridge.demo1.Implementor;

/**
 * @author zwl
 * @date 2021/8/12 9:29
 * @describe 具体实现化角色...
 */
public class ConcreteImplementorA implements Implementor {
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}