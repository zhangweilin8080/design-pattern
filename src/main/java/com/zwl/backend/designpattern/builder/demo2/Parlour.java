package com.zwl.backend.designpattern.builder.demo2;

import javax.swing.*;
import java.awt.*;

/**
 * @author zwl
 * @date 2021/8/10 10:20
 * @describe 产品：客厅...
 */
class Parlour {
    private String wall;    //墙
    private String TV;    //电视
    private String sofa;    //沙发
    public void setWall(String wall) {
        this.wall = wall;
    }
    public void setTV(String TV) {
        this.TV = TV;
    }
    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
    public void show() {
        JFrame jf = new JFrame("建造者模式测试");
        Container contentPane = jf.getContentPane();
        JPanel p = new JPanel();
        JScrollPane sp = new JScrollPane(p);
        String parlour = wall + TV + sofa;
        JLabel l = new JLabel(new ImageIcon("src/main/resources/img/" + parlour + ".jpg"));
        p.setLayout(new GridLayout(1, 1));
        p.setBorder(BorderFactory.createTitledBorder("客厅"));
        p.add(l);
        contentPane.add(sp, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

