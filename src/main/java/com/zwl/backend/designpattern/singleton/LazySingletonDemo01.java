package com.zwl.backend.designpattern.singleton;

/**
 * @author zwl
 * @date 2021/7/27 9:44
 * @describe 单例模式——懒汉...
 */

/**
 * 懒汉式-方式1（线程不安全）
 * <p>
 * 从下面代码我们可以看出该方式在成员位置声明Singleton类型的静态变量，并没有进行对象的
 * 赋值操作，那么什么时候赋值的呢？当调用getInstance()方法获取Singleton类的对象的时
 * 候才创建Singleton类的对象，这样就实现了懒加载的效果。但是，如果是多线程环境，会出现
 * 线程安全问题。
 */
public class LazySingletonDemo01 {
    //私有构造方法
    private LazySingletonDemo01() {

    }

    //在成员位置创建该类的对象
    private static LazySingletonDemo01 instance;

    //对外提供静态方法获取该对象
    public static LazySingletonDemo01 getInstance() {
        if (instance == null) {
            instance = new LazySingletonDemo01();
        }
        return instance;
    }
}

/**
 * 懒汉式-方式2（线程安全）
 * <p>
 * 该方式也实现了懒加载效果，同时又解决了线程安全问题。但是在getInstance()方法上添加了
 * synchronized关键字，导致该方法的执行效果特别低。从上面代码我们可以看出，其实就是在
 * 初始化instance的时候才会出现线程安全问题，一旦初始化完成就不存在了。
 */
class LazySingletonDemo02 {
    //私有构造方法
    private LazySingletonDemo02() {

    }

    //在成员位置创建该类的对象
    private static LazySingletonDemo02 instance;

    //对外提供静态方法获取该对象
    public static synchronized LazySingletonDemo02 getInstance() {
        if (instance == null) {
            instance = new LazySingletonDemo02();
        }
        return instance;
    }

}

/**
 * 懒汉式-方式3（双重检查锁）
 * <p>
 * 再来讨论一下懒汉模式中加锁的问题，对于 getInstance() 方法来说，绝大部分的操作都是读
 * 操作，读操作是线程安全的，所以我们没必让每个线程必须持有锁才能调用该方法，我们需要调整
 * 加锁的时机。由此也产生了一种新的实现模式：双重检查锁模式
 */
class LazySingletonDemo03 {
    //私有构造方法
    private LazySingletonDemo03() {

    }

    //在成员位置创建该类的对象
    private static LazySingletonDemo03 instance;

    //对外提供静态方法获取该对象
    public static LazySingletonDemo03 getInstance() {

        if (instance == null) {
            synchronized (LazySingletonDemo03.class) {
                //抢到锁之后再次判断是否为null
                if (instance == null) {
                    instance = new LazySingletonDemo03();
                }

            }
        }
        return instance;
    }

}


/**
 * 双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题，上面的双重检
 * 测锁模式看上去完美无缺，其实是存在问题，在多线程的情况下，可能会出现空指针问题，出现问
 * 题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
 * <p>
 * 要解决双重检查锁模式带来空指针异常的问题，只需要使用 volatile 关键字, volatile 关
 * 键字可以保证可见性和有序性。
 * <p>
 * 添加 volatile 关键字之后的双重检查锁模式是一种比较好的单例实现模式，能够保证在多线程
 * 的情况下线程安全也不会有性能问题。
 */
class LazySingletonDemo04 {
    //私有构造方法
    private LazySingletonDemo04() {

    }

    //在成员位置创建该类的对象
    private static volatile LazySingletonDemo04 instance;

    //对外提供静态方法获取该对象
    public static LazySingletonDemo04 getInstance() {

        if (instance == null) {
            synchronized (LazySingletonDemo04.class) {
                //抢到锁之后再次判断是否为null
                if (instance == null) {
                    instance = new LazySingletonDemo04();
                }

            }
        }
        return instance;
    }

}

/**
 * 懒汉式-方式4（静态内部类方式）
 * <p>
 * 静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中, 是不会加载静态
 * 内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。静态属性由于被
 * static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 *
 * 第一次加载Singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加
 * 载SingletonHolder
 * 并初始化INSTANCE，这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。
 *
 * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任
 * 何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 */
class LazySingletonDemo05 {
    //私有构造方法
    private LazySingletonDemo05() {

    }

    private static class SingletonHolder {
        private static final LazySingletonDemo05 INSTANCE = new LazySingletonDemo05();
    }

    //对外提供静态方法获取该对象
    public static LazySingletonDemo05 getInstance() {

        return SingletonHolder.INSTANCE;
    }

}


