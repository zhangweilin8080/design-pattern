package com.zwl.backend.designpattern.factory.factorymethod.demo1.impl;

import com.zwl.backend.designpattern.factory.factorymethod.demo1.Product;

/**
 * @author zwl
 * @date 2021/8/5 9:48
 * @describe instructions...
 */
//具体产品2：实现抽象产品中的抽象方法
public class ConcreteProduct2 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
