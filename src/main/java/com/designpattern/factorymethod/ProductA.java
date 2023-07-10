package com.designpattern.factorymethod;


import lombok.Data;

@Data
public class ProductA implements Product{
    String name = "Product A";

    @Override
    public String sell() {
        return "sell Product: " + name;
    }
}
