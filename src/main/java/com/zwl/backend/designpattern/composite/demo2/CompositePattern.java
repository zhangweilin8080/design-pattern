package com.zwl.backend.designpattern.composite.demo2;

import com.zwl.backend.designpattern.composite.demo2.impl.Composite;
import com.zwl.backend.designpattern.composite.demo2.impl.Leaf;

/**
 * @author zwl
 * @date 2021/9/1 10:03
 * @describe instructions...
 */
public class CompositePattern {
    public static void main(String[] args) {
        Composite c0 = new Composite();
        Composite c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
