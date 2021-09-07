package com.zwl.backend.designpattern.bridge.demo2.impl;

import com.zwl.backend.designpattern.bridge.demo2.Bag;

/**
 * @author zwl
 * @date 2021/8/12 9:45
 * @describe 扩展抽象化角色：挎包...
 */
public class HandBag extends Bag {
    public String getName() {
        return color.getColor() + "HandBag";
    }
}
