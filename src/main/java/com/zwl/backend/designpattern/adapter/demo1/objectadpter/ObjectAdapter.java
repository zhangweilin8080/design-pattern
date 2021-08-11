package com.zwl.backend.designpattern.adapter.demo1.objectadpter;

import com.zwl.backend.designpattern.adapter.demo1.Target;
import com.zwl.backend.designpattern.adapter.demo1.classadapter.Adaptee;

/**
 * @author zwl
 * @date 2021/8/11 17:25
 * @describe 对象适配器类...
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee)
    {
        this.adaptee=adaptee;
    }
    public void request()
    {
        adaptee.specificRequest();
    }
}