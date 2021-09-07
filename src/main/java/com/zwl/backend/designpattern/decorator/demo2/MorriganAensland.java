package com.zwl.backend.designpattern.decorator.demo2;

import com.zwl.backend.designpattern.decorator.demo2.impl.Girl;
import com.zwl.backend.designpattern.decorator.demo2.impl.Succubus;
import com.zwl.backend.designpattern.decorator.demo2.impl.original;

/**
 * @author zwl
 * @date 2021/8/12 14:00
 * @describe instructions...
 */
public class MorriganAensland {
    public static void main(String[] args) {
        Morrigan m0 = new original();
        m0.display();
        Morrigan m1 = new Succubus(m0);
        m1.display();
        Morrigan m2 = new Girl(m0);
        m2.display();
    }
}
