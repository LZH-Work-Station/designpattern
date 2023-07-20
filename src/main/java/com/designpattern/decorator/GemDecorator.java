package com.designpattern.decorator;

public class GemDecorator implements EquipDecorator{
    Equip equip;

    public GemDecorator(Equip equip){
        this.equip = equip;
    }

    @Override
    public int calculateAttack() {
        return equip.calculateAttack() + 10;
    }
}
