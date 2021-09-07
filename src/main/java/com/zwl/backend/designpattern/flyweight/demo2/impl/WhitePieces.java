package com.zwl.backend.designpattern.flyweight.demo2.impl;

import com.zwl.backend.designpattern.flyweight.demo2.ChessPieces;

import java.awt.*;

/**
 * @author zwl
 * @date 2021/8/30 9:40
 * @describe instructions...
 */
public class WhitePieces implements ChessPieces {
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}