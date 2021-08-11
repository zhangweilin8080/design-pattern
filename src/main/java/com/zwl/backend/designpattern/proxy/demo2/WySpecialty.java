package com.zwl.backend.designpattern.proxy.demo2;

import javax.swing.*;
import java.awt.*;

/**
 * @author zwl
 * @date 2021/8/11 14:58
 * @describe instructions...
 */
public class  WySpecialty extends JFrame implements Specialty {
    private static final long serialVersionUID = 1L;
    public WySpecialty() {
        super("韶关代理婺源特产测试");
        this.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel(new ImageIcon("src/main/resources/img/WuyuanSpecialty.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void display() {
        this.setVisible(true);
    }
}