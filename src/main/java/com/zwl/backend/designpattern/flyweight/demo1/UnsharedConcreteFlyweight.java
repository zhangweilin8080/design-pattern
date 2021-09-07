package com.zwl.backend.designpattern.flyweight.demo1;

/**
 * @author zwl
 * @date 2021/8/30 9:31
 * @describe 非享元角色...
 */
public class UnsharedConcreteFlyweight {
    private String info;
    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
