package com.designpattern.singleton;

public class DynamicSingleton {
    private static volatile DynamicSingleton dynamicSingleton;
    private DynamicSingleton(){}

    public static DynamicSingleton getInstance(){
        if(dynamicSingleton == null) {
            synchronized (DynamicSingleton.class) {
                if (dynamicSingleton == null) {
                    dynamicSingleton = new DynamicSingleton();
                }
            }
        }
        return dynamicSingleton;
    }
}

