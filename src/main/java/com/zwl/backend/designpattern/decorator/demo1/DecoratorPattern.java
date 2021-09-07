package com.zwl.backend.designpattern.decorator.demo1;

import com.zwl.backend.designpattern.decorator.demo1.impl.ConcreteComponent;
import com.zwl.backend.designpattern.decorator.demo1.impl.ConcreteDecorator;

/**
 * @author zwl
 * @date 2021/8/12 13:39
 * @describe instructions...
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
