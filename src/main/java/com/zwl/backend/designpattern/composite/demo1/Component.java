package com.zwl.backend.designpattern.composite.demo1;

/**
 * @author zwl
 * @date 2021/9/1 9:55
 * @describe 抽象构件...
 */
public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
