package com.zwl.backend.designpattern.composite.demo1.impl;

import com.zwl.backend.designpattern.composite.demo1.Component;

import java.util.ArrayList;

/**
 * @author zwl
 * @date 2021/9/1 9:57
 * @describe 树枝构件...
 */
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();
    public void add(Component c) {
        children.add(c);
    }
    public void remove(Component c) {
        children.remove(c);
    }
    public Component getChild(int i) {
        return children.get(i);
    }
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}