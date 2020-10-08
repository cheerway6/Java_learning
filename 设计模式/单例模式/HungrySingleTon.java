package com.liucw.java.designPatterns;

public class HungrySingleTon {
    private static final HungrySingleTon INSTANCE = new HungrySingleTon();

    private HungrySingleTon(){

    }

    public static HungrySingleTon getInstance(){
        return INSTANCE;
    }
}


// 饿汉模式在类被初始化时就在内存中创建了静态对象，以空间换时间不存在线程安全问题