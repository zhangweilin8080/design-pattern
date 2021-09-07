package com.zwl.backend.designpattern.templatemethod.demo3;

/**
 * @author zwl
 * @date 2021/9/7 14:43
 * @describe instructions...
 */
public class HookTemplateMethod {
    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.TemplateMethod();
    }
}
