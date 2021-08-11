package com.zwl.backend.designpattern.factory.factorymethod.demo1;

/**
 * @author zwl
 * @date 2021/8/5 9:48
 * @describe instructions...
 */
//抽象工厂：提供了厂品的生成方法
public interface AbstractFactory {
    public Product newProduct();
}
