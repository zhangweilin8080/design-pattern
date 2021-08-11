package com.zwl.backend.designpattern.factory.factorymethod.demo1.impl;

import com.zwl.backend.designpattern.factory.factorymethod.demo1.AbstractFactory;
import com.zwl.backend.designpattern.factory.factorymethod.demo1.Product;

/**
 * @author zwl
 * @date 2021/8/5 9:48
 * @describe instructions...
 */
//具体工厂1：实现了厂品的生成方法
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
