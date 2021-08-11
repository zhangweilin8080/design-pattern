package com.zwl.backend.designpattern.adapter.demo2;

/**
 * @author zwl
 * @date 2021/8/11 17:29
 * @describe 客户端代码...
 */
public class MotorAdapterTest {
    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        Motor motor = (Motor) ReadXML.getObject();
        motor.drive();
    }
}
