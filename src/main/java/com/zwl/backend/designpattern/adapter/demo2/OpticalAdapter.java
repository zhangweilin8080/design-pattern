package com.zwl.backend.designpattern.adapter.demo2;

/**
 * @author zwl
 * @date 2021/8/11 17:28
 * @describe 光能适配器...
 */
public class OpticalAdapter implements Motor {
    private OpticalMotor omotor;

    public OpticalAdapter() {
        omotor = new OpticalMotor();
    }

    public void drive() {
        omotor.opticalDrive();
    }
}