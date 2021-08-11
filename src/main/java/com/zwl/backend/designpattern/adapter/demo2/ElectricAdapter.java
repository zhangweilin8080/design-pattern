package com.zwl.backend.designpattern.adapter.demo2;

/**
 * @author zwl
 * @date 2021/8/11 17:28
 * @describe 电能适配器...
 */
public class ElectricAdapter implements Motor {
    private ElectricMotor emotor;

    public ElectricAdapter() {
        emotor = new ElectricMotor();
    }

    public void drive() {
        emotor.electricDrive();
    }
}