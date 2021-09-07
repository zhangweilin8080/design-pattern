package com.zwl.backend.designpattern.composite.demo3.impl;

import com.zwl.backend.designpattern.composite.demo3.Articles;

/**
 * @author zwl
 * @date 2021/9/1 10:08
 * @describe 树叶构件：商品...
 */
public class Goods  implements Articles {
    private String name;     //名字
    private int quantity;    //数量
    private float unitPrice; //单价
    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public float calculation() {
        return quantity * unitPrice;
    }
    public void show() {
        System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");
    }
}