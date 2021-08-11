package com.zwl.backend.designpattern.prototype.demo1;

/**
 * @author zwl
 * @date 2021/8/11 13:24
 * @describe 原型模式的测试类...
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}
