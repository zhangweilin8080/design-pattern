package com.zwl.backend.designpattern.prototype.demo4;

/**
 * @author zwl
 * @date 2021/8/11 13:57
 * @describe instructions...
 */
public interface Shape extends Cloneable {
    public Object clone();    //拷贝
    public void countArea();    //计算面积
}