package com.designpattern.decorator;

public class WristEquip implements Equip{
    @Override
    public int calculateAttack() {
        return 20;
    }
}
