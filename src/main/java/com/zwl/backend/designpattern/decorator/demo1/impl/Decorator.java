package com.zwl.backend.designpattern.decorator.demo1.impl;

import com.zwl.backend.designpattern.decorator.demo1.Component;

/**
 * @author zwl
 * @date 2021/8/12 13:35
 * @describe 抽象装饰角色...
 */
public class Decorator  implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    public void operation() {
        component.operation();
    }
}