package com.zwl.backend.designpattern.singleton;

import java.io.Serializable;

/**
 * @author zwl
 * @date 2021/7/27 14:03
 * @describe 解决序列化破坏单例...
 */

/**
 * 序列化、反序列方式破坏单例模式的解决方法
 * <p>
 * 在Singleton类中添加 readResolve() 方法，在反序列化时被反射调用，如果定义了这个方法，
 * 就返回这个方法的值，如果没有定义，则返回新new出来的对象。
 */
public class ResolvingSerializationDestroySingletonDemo {


    private static final ResolvingSerializationDestroySingletonDemo INSTANCE = new ResolvingSerializationDestroySingletonDemo();

    private ResolvingSerializationDestroySingletonDemo() {
    }

    public static ResolvingSerializationDestroySingletonDemo getInstance() {
        return INSTANCE;
    }

    /*** 下面是为了解决序列化反序列化破解单例模式 */
    private Object readResolve() {
        return ResolvingSerializationDestroySingletonDemo.INSTANCE;
    }

}

/**
 * 反射方式破解单例的解决方法
 *
 * 这种方式比较好理解。当通过反射方式调用构造方法进行创建创建时，直接抛异常。不运行此中操
 * 作。
 */
class ResolvingReflectionDestroySingletonDemo {
    private static final ResolvingReflectionDestroySingletonDemo INSTANCE = new ResolvingReflectionDestroySingletonDemo();

    private ResolvingReflectionDestroySingletonDemo() {
        /* 反射破解单例模式需要添加的代码 */
        if (INSTANCE != null) {
            throw new RuntimeException();
        }
    }

    public static ResolvingReflectionDestroySingletonDemo getInstance() {
        return INSTANCE;
    }
}