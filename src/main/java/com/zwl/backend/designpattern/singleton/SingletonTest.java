package com.zwl.backend.designpattern.singleton;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author zwl
 * @date 2021/7/20 15:01
 * @describe instructions...
 */
public class SingletonTest {

    @Test
    public void test01() {

    }

    /**
     * 破坏单例模式——序列化与反序列化
     *
     * 下面代码运行结果是 false ，表明序列化和反序列化已经破坏了单例设计模式。
     */
    @Test
    public void destroySingleton01() throws Exception {
        //往文件中写对象
        writeObject2File();
        // 从文件中读取对象
        HungrySingletonDemo01 s1 = readObjectFromFile();
        HungrySingletonDemo01 s2 = readObjectFromFile();

        //判断两个反序列化后的对象是否是同一个对象
        System.out.println(s1 == s2);
    }


    public static void writeObject2File() throws Exception {
        //获取Singleton类的对象
        HungrySingletonDemo01 instance = HungrySingletonDemo01.getInstance();
        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\a.txt"));
        // 将instance对象写出到文件中
        oos.writeObject(instance);
    }


    private static HungrySingletonDemo01 readObjectFromFile() throws Exception {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\a.txt"));
        // 第一个读取Singleton对象
        HungrySingletonDemo01 instance = (HungrySingletonDemo01) ois.readObject();
        return instance;
    }


    /**
     * 破坏单例模式——反射
     *
     * 下面代码运行结果是 false ，表明序列化和反序列化已经破坏了单例设计模式
     *
     * 枚举方式不会出现反射和序列号破坏单例模式的问题。
     */
    @Test
    public void destroySingleton02() throws Exception {
       //获取Singleton类的字节码对象
        Class clazz = HungrySingletonDemo01.class;
        //获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建Singleton类的对象s1
        HungrySingletonDemo01 s1 = (HungrySingletonDemo01) constructor.newInstance();
        //创建Singleton类的对象s2
        HungrySingletonDemo01 s2 = (HungrySingletonDemo01) constructor.newInstance();
        //判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);
    }

}
