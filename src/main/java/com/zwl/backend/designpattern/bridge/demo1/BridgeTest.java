package com.zwl.backend.designpattern.bridge.demo1;

import com.zwl.backend.designpattern.bridge.demo1.impl.ConcreteImplementorA;

/**
 * @author zwl
 * @date 2021/8/12 9:32
 * @describe instructions...
 */
public class BridgeTest {
    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}
