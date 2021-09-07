package com.zwl.backend.designpattern.flyweight.demo2;

import com.zwl.backend.designpattern.flyweight.demo2.impl.BlackPieces;
import com.zwl.backend.designpattern.flyweight.demo2.impl.WhitePieces;

import java.util.ArrayList;

/**
 * @author zwl
 * @date 2021/8/30 9:42
 * @describe 享元工厂角色...
 */
public class WeiqiFactory {
    private ArrayList<ChessPieces> qz;
    public WeiqiFactory() {
        qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);
    }
    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return (ChessPieces) qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return (ChessPieces) qz.get(1);
        } else {
            return null;
        }
    }
}
