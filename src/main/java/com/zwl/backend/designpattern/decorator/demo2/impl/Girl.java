package com.zwl.backend.designpattern.decorator.demo2.impl;

import com.zwl.backend.designpattern.decorator.demo2.Morrigan;

/**
 * @author zwl
 * @date 2021/8/12 13:56
 * @describe 具体装饰角色：少女...
 */
public class Girl extends Changer {
    public Girl(Morrigan m) {
        super(m);
    }
    public void display() {
        setChanger();
        super.display();
    }
    public void setChanger() {
        ((original) super.m).setImage("Morrigan2.jpg");
    }
}
