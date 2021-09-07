package com.zwl.backend.designpattern.bridge.demo2.impl;

import com.zwl.backend.designpattern.bridge.demo2.Bag;

/**
 * @author zwl
 * @date 2021/8/12 9:47
 * @describe 扩展抽象化角色：钱包...
 */
public class Wallet extends Bag {
    public String getName() {
        return color.getColor() + "Wallet";
    }
}
