package com.designpattern;

import com.designpattern.factorymethod.Factory;
import com.designpattern.factorymethod.ProductAFactory;
import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void test01(){
        Factory factory = new ProductAFactory();
        System.out.println(factory.createProduct().sell());
    }
}
