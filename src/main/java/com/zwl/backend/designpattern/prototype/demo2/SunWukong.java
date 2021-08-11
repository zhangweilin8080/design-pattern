package com.zwl.backend.designpattern.prototype.demo2;

import javax.swing.*;

/**
 * @author zwl
 * @date 2021/8/11 13:27
 * @describe instructions...
 */
public class SunWukong extends JPanel implements Cloneable {
    private static final long serialVersionUID = 5543049531872119328L;
    public SunWukong() {
        JLabel l1 = new JLabel(new ImageIcon("src/main/resources/img/Wukong.jpg"));
        this.add(l1);
    }
    public Object clone() {
        SunWukong w = null;
        try {
            w = (SunWukong) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝悟空失败!");
        }
        return w;
    }
}
