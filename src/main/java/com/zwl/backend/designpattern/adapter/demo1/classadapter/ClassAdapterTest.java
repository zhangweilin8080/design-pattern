package com.zwl.backend.designpattern.adapter.demo1.classadapter;

import com.zwl.backend.designpattern.adapter.demo1.Target;

/**
 * @author zwl
 * @date 2021/8/11 17:23
 * @describe instructions...
 */
public class ClassAdapterTest
{
    public static void main(String[] args)
    {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}