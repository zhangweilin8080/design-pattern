package com.zwl.backend.designpattern.builder.demo1;

/**
 * @author zwl
 * @date 2021/8/10 10:14
 * @describe 具体建造者：实现了抽象建造者接口。...
 */
public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
