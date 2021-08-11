package com.zwl.backend.designpattern.factory.abstractfactory.impl;

import com.zwl.backend.designpattern.factory.abstractfactory.Plant;

import javax.swing.*;
import java.awt.*;

/**
 * @author zwl
 * @date 2021/8/5 13:51
 * @describe instructions...
 */
//具体产品：蔬菜类
public class Vegetables implements Plant {
    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");
    public Vegetables() {
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("植物：蔬菜"));
        sp = new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon("src/main/resources/img/P_Vegetables.jpg"));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户点击窗口关闭
    }
    public void show() {
        jf.setVisible(true);
    }
}
