package com.zwl.backend.designpattern.adapter.demo3;

import com.zwl.backend.designpattern.adapter.demo3.impl.AdapteeRealize;
import com.zwl.backend.designpattern.adapter.demo3.impl.TargetRealize;

/**
 * @author zwl
 * @date 2021/8/11 17:37
 * @describe instructions...
 */
public class TwoWayAdapterTest {
    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee adaptee = new AdapteeRealize();
        TwoWayTarget target = new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target = new TargetRealize();
        adaptee = new TwoWayAdapter(target);
        adaptee.specificRequest();
    }
}
