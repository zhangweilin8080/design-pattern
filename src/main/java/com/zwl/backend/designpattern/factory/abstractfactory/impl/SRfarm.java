package com.zwl.backend.designpattern.factory.abstractfactory.impl;

import com.zwl.backend.designpattern.factory.abstractfactory.Animal;
import com.zwl.backend.designpattern.factory.abstractfactory.Farm;
import com.zwl.backend.designpattern.factory.abstractfactory.Plant;

/**
 * @author zwl
 * @date 2021/8/5 13:52
 * @describe instructions...
 */
//具体工厂：上饶农场类
public class SRfarm implements Farm {
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}
