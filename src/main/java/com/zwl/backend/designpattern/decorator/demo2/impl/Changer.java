package com.zwl.backend.designpattern.decorator.demo2.impl;

import com.zwl.backend.designpattern.decorator.demo2.Morrigan;

/**
 * @author zwl
 * @date 2021/8/12 13:53
 * @describe 抽象装饰角色：变形...
 */
public class Changer implements Morrigan {
    Morrigan m;
    public Changer(Morrigan m) {
        this.m = m;
    }
    public void display() {
        m.display();
    }
}