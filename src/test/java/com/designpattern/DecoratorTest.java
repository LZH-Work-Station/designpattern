package com.designpattern;

import com.designpattern.decorator.Equip;
import com.designpattern.decorator.GemDecorator;
import com.designpattern.decorator.WristEquip;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void test01(){
        WristEquip wristEquip = new WristEquip();
        Equip equip = new GemDecorator(wristEquip);
        int i = equip.calculateAttack();
        System.out.println(i);
    }
}
