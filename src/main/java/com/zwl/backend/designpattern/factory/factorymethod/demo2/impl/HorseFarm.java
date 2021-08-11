package com.zwl.backend.designpattern.factory.factorymethod.demo2.impl;

import com.zwl.backend.designpattern.factory.factorymethod.demo2.Animal;
import com.zwl.backend.designpattern.factory.factorymethod.demo2.AnimalFarm;
import com.zwl.backend.designpattern.factory.factorymethod.demo2.impl.Horse;

/**
 * @author zwl
 * @date 2021/8/5 10:20
 * @describe instructions...
 */
//具体工厂：养马场
public class HorseFarm implements AnimalFarm {
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}
