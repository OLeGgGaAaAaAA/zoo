package com.level.zoo.animal.impl;

import com.level.zoo.animal.AbstractAnimal;

/**
 * Created by cube on 09.11.2017.
 */
public class Cat extends AbstractAnimal {
    @Override
    public void getName(int age) {

    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }

    @Override
    public String getAnimalClass() {
        return "Кошак";
    }

    @Override
    public String getName(String s) {
        return null;
    }

    @Override
    public int getMaxAge() {
        return 0;
    }

    @Override
    public void setName() {

    }
}
