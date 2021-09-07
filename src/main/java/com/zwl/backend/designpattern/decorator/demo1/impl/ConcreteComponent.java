package com.zwl.backend.designpattern.decorator.demo1.impl;

import com.zwl.backend.designpattern.decorator.demo1.Component;

/**
 * @author zwl
 * @date 2021/8/12 13:34
 * @describe instructions...
 */
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
