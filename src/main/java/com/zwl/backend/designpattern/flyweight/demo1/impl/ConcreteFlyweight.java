package com.zwl.backend.designpattern.flyweight.demo1.impl;

import com.zwl.backend.designpattern.flyweight.demo1.Flyweight;
import com.zwl.backend.designpattern.flyweight.demo1.UnsharedConcreteFlyweight;

/**
 * @author zwl
 * @date 2021/8/30 9:32
 * @describe instructions...
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;
    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + outState.getInfo());
    }
}