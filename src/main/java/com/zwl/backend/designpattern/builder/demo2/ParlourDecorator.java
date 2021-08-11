package com.zwl.backend.designpattern.builder.demo2;

/**
 * @author zwl
 * @date 2021/8/10 10:33
 * @describe instructions...
 */
public class ParlourDecorator {
    public static void main(String[] args) {
        try {
            Decorator d;
            d = (Decorator) ReadXML.getObject();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
