package com.zwl.backend.designpattern.adapter.demo1.classadapter;

import com.zwl.backend.designpattern.adapter.demo1.Target;

/**
 * @author zwl
 * @date 2021/8/11 17:23
 * @describe 类适配器类...
 */
public class ClassAdapter extends Adaptee implements Target
{
    public void request()
    {
        specificRequest();
    }
}
