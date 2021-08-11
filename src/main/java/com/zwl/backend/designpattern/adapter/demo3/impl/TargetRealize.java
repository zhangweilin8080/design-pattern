package com.zwl.backend.designpattern.adapter.demo3.impl;

import com.zwl.backend.designpattern.adapter.demo3.TwoWayTarget;

/**
 * @author zwl
 * @date 2021/8/11 17:36
 * @describe 目标实现...
 */
public class TargetRealize implements TwoWayTarget {
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
