package com.liucw.java.designPatterns;

public class LazySingleTon {
    private static LazySingleTon INSTANCE = null;
    private LazySingleTon(){

    }

    public static LazySingleTon getInstance(){
        if(INSTANCE==null){
            INSTANCE = new LazySingleTon();
        }
        return INSTANCE;
    }
}
// 2个线程同时判断instance为空，实例化2个对象 变为双例，线程不安全