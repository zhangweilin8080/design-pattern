package com.zwl.backend.designpattern.prototype.demo1;

/**
 * @author zwl
 * @date 2021/8/11 13:18
 * @describe 具体原型类...
 */
public class Realizetype implements Cloneable {
    Realizetype() {
        System.out.println("具体原型创建成功！");
    }
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
