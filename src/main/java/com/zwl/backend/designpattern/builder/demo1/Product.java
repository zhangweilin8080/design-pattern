package com.zwl.backend.designpattern.builder.demo1;

/**
 * @author zwl
 * @date 2021/8/10 10:08
 * @describe 产品角色：包含多个组成部件的复杂对象。...
 */
class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        //显示产品的特性
    }
}
