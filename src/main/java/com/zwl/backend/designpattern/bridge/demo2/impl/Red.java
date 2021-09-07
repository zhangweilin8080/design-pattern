package com.zwl.backend.designpattern.bridge.demo2.impl;

import com.zwl.backend.designpattern.bridge.demo2.Color;

/**
 * @author zwl
 * @date 2021/8/12 9:43
 * @describe 具体实现化角色：红色...
 */
public class Red implements Color {
    public String getColor() {
        return "red";
    }
}
