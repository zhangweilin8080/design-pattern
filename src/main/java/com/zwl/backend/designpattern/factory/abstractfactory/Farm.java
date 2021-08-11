package com.zwl.backend.designpattern.factory.abstractfactory;

/**
 * @author zwl
 * @date 2021/8/5 13:51
 * @describe instructions...
 */
//抽象工厂：农场类
public interface Farm {
     Animal newAnimal();
     Plant newPlant();
}
