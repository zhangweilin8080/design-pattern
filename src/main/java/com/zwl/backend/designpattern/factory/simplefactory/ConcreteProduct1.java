package com.zwl.backend.designpattern.factory.simplefactory;

/**
 * @author zwl
 * @date 2021/7/27 17:32
 * @describe instructions...
 */
public class ConcreteProduct1 implements Product  {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
