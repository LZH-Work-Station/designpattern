package com.designpattern.factorymethod;

public class ProductAFactory implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
