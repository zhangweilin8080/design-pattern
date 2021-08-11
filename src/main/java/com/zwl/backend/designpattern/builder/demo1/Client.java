package com.zwl.backend.designpattern.builder.demo1;

/**
 * @author zwl
 * @date 2021/8/10 10:16
 * @describe 客户类...
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
