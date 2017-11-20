package com.level;

import com.level.zoo.MenuStandardComponent;
import com.level.zoo.Zoo;
import com.level.zoo.animal.AnimalInitializer;
import com.level.zoo.animal.FileUtils;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by cube on 09.11.2017.
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        boolean exitFromCreator = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя зоопарка");
        Zoo zoo = new Zoo(scanner.nextLine());
        scanner.nextLine();
        MenuStandardComponent.menuWriter(MenuStandardComponent.ADD_NEW_ANIMAL);
        while (!exitFromCreator) {
            exitFromCreator = !zoo.addAnimal(AnimalInitializer.getAnimalFromMenu(scanner.nextInt()));
        }

        System.out.println(zoo);
        try {
            System.out.println(FileUtils.read("src/zoo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
