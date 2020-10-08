package com.liucw.java.designPatterns;

public class staticinsideclassSingleTon {
    private staticinsideclassSingleTon(){

    }

    private static class SingleTonHolder{
        private static final staticinsideclassSingleTon INSTANCE = new staticinsideclassSingleTon();
    }

    public static staticinsideclassSingleTon getInstance(){
        return SingleTonHolder.INSTANCE;
    }

}

//静态内部类
/*
优点：外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存。
确保线程安全，保证单例唯一性和延迟单例的实例化

缺点：无法传参
 */