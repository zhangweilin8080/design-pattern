package com.zwl.backend.designpattern.adapter.demo3.impl;

import com.zwl.backend.designpattern.adapter.demo3.TwoWayAdaptee;

/**
 * @author zwl
 * @date 2021/8/11 17:36
 * @describe 适配者实现...
 */
public class AdapteeRealize implements TwoWayAdaptee {
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}