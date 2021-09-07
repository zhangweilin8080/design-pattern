package com.zwl.backend.designpattern.bridge.demo2;

/**
 * @author zwl
 * @date 2021/8/12 9:45
 * @describe 抽象化角色：包...
 */
public abstract class Bag {
    protected Color color;
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract String getName();
}