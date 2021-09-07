package com.zwl.backend.designpattern.flyweight.demo2.impl;

import com.zwl.backend.designpattern.flyweight.demo2.ChessPieces;

import java.awt.*;

/**
 * @author zwl
 * @date 2021/8/30 9:41
 * @describe 具体享元角色：黑子...
 */
public class BlackPieces implements ChessPieces {
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
