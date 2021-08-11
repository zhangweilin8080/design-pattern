package com.zwl.backend.designpattern.builder.demo1;

/**
 * @author zwl
 * @date 2021/8/10 10:08
 * @describe 抽象建造者：包含创建产品各个子部件的抽象方法。...
 */
public abstract  class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }

}
