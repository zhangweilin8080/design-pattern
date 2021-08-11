package com.zwl.backend.designpattern.builder.demo1;

/**
 * @author zwl
 * @date 2021/8/10 10:15
 * @describe 指挥者：调用建造者中的方法完成复杂对象的创建。...
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
