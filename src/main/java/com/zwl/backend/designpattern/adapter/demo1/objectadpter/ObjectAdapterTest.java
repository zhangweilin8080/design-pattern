package com.zwl.backend.designpattern.adapter.demo1.objectadpter;

import com.zwl.backend.designpattern.adapter.demo1.Target;
import com.zwl.backend.designpattern.adapter.demo1.classadapter.Adaptee;

/**
 * @author zwl
 * @date 2021/8/11 17:25
 * @describe instructions...
 */
public class ObjectAdapterTest
{
    public static void main(String[] args)
    {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
