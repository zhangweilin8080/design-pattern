package com.zwl.backend.designpattern.flyweight.demo2;

import java.awt.*;

/**
 * @author zwl
 * @date 2021/8/30 9:40
 * @describe 抽象享元角色：棋子...
 */
public interface  ChessPieces {
    void DownPieces(Graphics g, Point pt);    //下子
}
