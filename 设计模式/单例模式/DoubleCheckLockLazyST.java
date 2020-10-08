package com.liucw.java.designPatterns;

public class DoubleCheckLockLazyST {
    private volatile static DoubleCheckLockLazyST INSTANCE = null; //解决指令重排序 NPE异常问题

    private DoubleCheckLockLazyST() {

    }

    public static DoubleCheckLockLazyST getInstance() {
        if (INSTANCE == null) { //线程A或B同时看到实例为null，如果已初始化则直接返回实例 【避免非必要加锁，提高效率】
            synchronized (DoubleCheckLockLazyST.class) {//线程A或B获得锁并进行初始化
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockLazyST();
                }
            }
        }
        return INSTANCE;
    }
}


/*


INSTANCE = new DoubleCheckLockLazyST();
在JVM里的执行分3步

1、在堆内存中开辟内存空间
2、初始化实例参数
3、将实例对象指向内存空间

指令重排序后 线程A执行顺序为A1-A3-*切换到线程B*-此时INSTANCE非空，线程B直接获取到未初始化的INSTANCE-*异常*-A2
 */