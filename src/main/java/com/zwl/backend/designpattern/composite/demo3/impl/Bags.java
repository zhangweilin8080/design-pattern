package com.zwl.backend.designpattern.composite.demo3.impl;

import com.zwl.backend.designpattern.composite.demo3.Articles;

import java.util.ArrayList;

/**
 * @author zwl
 * @date 2021/9/1 10:10
 * @describe 树枝构件：袋子...
 */
public class Bags implements Articles {
    private String name;     //名字
    private ArrayList<Articles> bags = new ArrayList<Articles>();
    public Bags(String name) {
        this.name = name;
    }
    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }
    public Articles getChild(int i) {
        return bags.get(i);
    }
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }
    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}
