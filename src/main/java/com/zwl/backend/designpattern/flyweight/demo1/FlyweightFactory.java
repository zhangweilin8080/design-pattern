package com.zwl.backend.designpattern.flyweight.demo1;

import com.zwl.backend.designpattern.flyweight.demo1.impl.ConcreteFlyweight;

import java.util.HashMap;

/**
 * @author zwl
 * @date 2021/8/30 9:34
 * @describe 享元工厂角色...
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = (Flyweight) flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
