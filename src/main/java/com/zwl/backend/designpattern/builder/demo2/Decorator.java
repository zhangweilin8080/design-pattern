package com.zwl.backend.designpattern.builder.demo2;

/**
 * @author zwl
 * @date 2021/8/10 10:21
 * @describe 抽象建造者：装修工人...
 */
public abstract class Decorator {
    //创建产品对象
    protected Parlour product = new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}