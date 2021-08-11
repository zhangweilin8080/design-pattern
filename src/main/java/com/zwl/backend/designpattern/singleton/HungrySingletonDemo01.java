package com.zwl.backend.designpattern.singleton;

/**
 * @author zwl
 * @date 2021/7/20 14:57
 * @describe 单例模式-饿汉...
 */


import java.io.Serializable;

/**
 *  饿汉式-方式1（静态变量方式）
 *
 * 该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。
 * instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存
 * 的浪费。
 */

public class HungrySingletonDemo01  implements Serializable {

    private static final HungrySingletonDemo01 instance = new HungrySingletonDemo01();
    private HungrySingletonDemo01() {
    }
    public static HungrySingletonDemo01 getInstance() {
        return instance;
    }

}

/**
 * 饿汉式-方式2（静态代码块方式）
 *
 * 该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着
 * 类的加载而创建。所以和饿汉式的方式1基本上一样，当然该方式也存在内存浪费问题。
 */
class HungrySingletonDemo02 {
    private static HungrySingletonDemo02 instance;

    private HungrySingletonDemo02() {
    }
    static {
        instance=new HungrySingletonDemo02();
    }

    public static HungrySingletonDemo02 getInstance() {
        return instance;
    }
}




