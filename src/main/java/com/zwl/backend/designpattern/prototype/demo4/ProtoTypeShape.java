package com.zwl.backend.designpattern.prototype.demo4;

/**
 * @author zwl
 * @date 2021/8/11 14:03
 * @describe instructions...
 */
public class ProtoTypeShape {
    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle) pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = (Shape) pm.getShape("Square");
        obj2.countArea();
    }
}
