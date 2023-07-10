package com.designpattern.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = new LazySingleton();

    private LazySingleton(){}

    public LazySingleton getInstance(){
        return lazySingleton;
    }
}
