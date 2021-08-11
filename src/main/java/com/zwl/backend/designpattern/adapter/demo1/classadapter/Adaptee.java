package com.zwl.backend.designpattern.adapter.demo1.classadapter;

/**
 * @author zwl
 * @date 2021/8/11 17:22
 * @describe 适配者...
 */
public class Adaptee {
    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}
