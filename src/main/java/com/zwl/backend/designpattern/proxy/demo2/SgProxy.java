package com.zwl.backend.designpattern.proxy.demo2;

/**
 * @author zwl
 * @date 2021/8/11 14:59
 * @describe 代理：韶关代理...
 */
public class SgProxy implements Specialty {
    private WySpecialty realSubject = new WySpecialty();
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest() {
        System.out.println("韶关代理婺源特产开始。");
    }
    public void postRequest() {
        System.out.println("韶关代理婺源特产结束。");
    }
}