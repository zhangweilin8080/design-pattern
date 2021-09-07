package com.zwl.backend.designpattern.bridge.demo2.impl;

import com.zwl.backend.designpattern.bridge.demo2.Color;

/**
 * @author zwl
 * @date 2021/8/12 9:41
 * @describe 具体实现化角色：黄色...
 */
public class Yellow  implements Color {
    public String getColor() {
        return "yellow";
    }

}