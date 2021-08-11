package com.zwl.backend.designpattern.factory.abstractfactory.impl;

import com.zwl.backend.designpattern.factory.abstractfactory.Animal;
import com.zwl.backend.designpattern.factory.abstractfactory.Farm;
import com.zwl.backend.designpattern.factory.abstractfactory.Plant;

/**
 * @author zwl
 * @date 2021/8/5 13:51
 * @describe instructions...
 */
//具体工厂：韶关农场类
public class SGfarm implements Farm {
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
