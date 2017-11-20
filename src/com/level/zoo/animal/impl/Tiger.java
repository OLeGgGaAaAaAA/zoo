package com.level.zoo.animal.impl;

import com.level.zoo.animal.AbstractAnimal;

/**
 * Created by cube on 09.11.2017.
 */
public class Tiger extends AbstractAnimal {


    @Override
    public void getName(int age) {

    }

    @Override
    public void say() {
        System.out.println("РРРРРррр!!!!");
    }

    @Override
    public String getAnimalClass() {
        return "Тигра";
    }

    @Override
    public String getName(String s) {
        return null;
    }

    @Override
    public void setName() {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public int getMaxAge() {
        return 20;
    }

}
