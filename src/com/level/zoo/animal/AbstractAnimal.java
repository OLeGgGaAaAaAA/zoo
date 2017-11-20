package com.level.zoo.animal;

import com.level.zoo.animal.impl.Cat;
import com.level.zoo.animal.impl.Dog;
import com.level.zoo.animal.impl.Elephant;
import com.level.zoo.animal.impl.Tiger;

/**
 * Created by cube on 09.11.2017.
 */
public abstract class AbstractAnimal implements Animal {
    public abstract void setName();

    public String goToToilet() {
        return "=^-^= срунь срунь";
    }

    private int age;
    private String name;

    @Override
    public String toString() {
        return getAnimalClass() + "{" +
                "в туалете :" + goToToilet() +
                "}";
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
