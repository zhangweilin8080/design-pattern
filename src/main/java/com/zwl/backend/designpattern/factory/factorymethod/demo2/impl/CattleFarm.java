package com.zwl.backend.designpattern.factory.factorymethod.demo2.impl;

import com.zwl.backend.designpattern.factory.factorymethod.demo2.Animal;
import com.zwl.backend.designpattern.factory.factorymethod.demo2.AnimalFarm;
import com.zwl.backend.designpattern.factory.factorymethod.demo2.impl.Cattle;

/**
 * @author zwl
 * @date 2021/8/5 10:21
 * @describe instructions...
 */
//具体工厂：养牛场
public class CattleFarm implements AnimalFarm {
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}
