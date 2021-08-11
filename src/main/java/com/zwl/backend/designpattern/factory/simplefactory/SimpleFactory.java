package com.zwl.backend.designpattern.factory.simplefactory;

/**
 * @author zwl
 * @date 2021/7/27 17:40
 * @describe instructions...
 */
public class SimpleFactory {
    public static Product makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ConcreteProduct1();
            case Const.PRODUCT_B:
                return new ConcreteProduct2();
        }
        return null;
    }

}
