package com.zwl.backend.designpattern.adapter.demo3;

/**
 * @author zwl
 * @date 2021/8/11 17:36
 * @describe 双向适配器...
 */
public class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }

    public void specificRequest() {
        target.request();
    }
}
