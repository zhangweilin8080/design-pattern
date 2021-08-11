package com.zwl.backend.designpattern.builder.demo2;

/**
 * @author zwl
 * @date 2021/8/10 10:22
 * @describe 具体建造者：具体装修工人1...
 */
public class ConcreteDecorator1 extends Decorator {
    public void buildWall() {
        product.setWall("w1");
    }
    public void buildTV() {
        product.setTV("TV1");
    }
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
