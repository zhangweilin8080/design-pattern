package com.zwl.backend.designpattern.templatemethod.demo1;

/**
 * @author zwl
 * @date 2021/9/7 14:37
 * @describe instructions...
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
