package com.zwl.backend.designpattern.factory.factorymethod.demo2;

/**
 * @author zwl
 * @date 2021/8/5 10:21
 * @describe 用工厂方法模式设计畜牧场。...
 * 分析：有很多种类的畜牧场，如养马场用于养马，养牛场用于养牛，所以该实例用工厂方法模式比较适合。
 *
 */
public class AnimalFarmTest {
    public static void main(String[] args) {
        try {
            Animal a;
            AnimalFarm af;
            af = (AnimalFarm) ReadXML2.getObject();
            a = af.newAnimal();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
