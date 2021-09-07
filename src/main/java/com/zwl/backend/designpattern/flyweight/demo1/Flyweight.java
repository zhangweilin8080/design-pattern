package com.zwl.backend.designpattern.flyweight.demo1;

/**
 * @author zwl
 * @date 2021/8/30 9:32
 * @describe 抽象享元角色...
 */
public interface  Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}
