package com.zwl.backend.designpattern.decorator.demo1.impl;

import com.zwl.backend.designpattern.decorator.demo1.Component;

/**
 * @author zwl
 * @date 2021/8/12 13:36
 * @describe 具体装饰角色...
 */
public class ConcreteDecorator  extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation() {
        super.operation();
        addedFunction();
    }
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}