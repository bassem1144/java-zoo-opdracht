package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if(input.equals("exit") || input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split("\\s+", 2);

            if(inputParts[0].equals("hello")) {
                if(inputParts.length == 1) {
                    for(Animal animal : animals)
                        sayHelloToAnimal(animal);
                } else {
                    String animalName = inputParts[1].trim();
                    boolean found = false;
                    for(Animal animal : animals) {
                        if(animal.getName().equalsIgnoreCase(animalName)) {
                            sayHelloToAnimal(animal);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Animal not found: " + inputParts[1]);
                }
            } else if(input.equals("give leaves")) {
                for(Animal animal : animals) {
                    if(animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    }
                }
            } else if(input.equals("give meat")) {
                for(Animal animal : animals) {
                    if(animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat();
                    }
                }
            } else if(input.equals("perform tricks")) {
                for(Animal animal : animals) {
                    if(animal instanceof TrickPerformer) {
                        ((TrickPerformer) animal).performTrick();
                    }
                }
            } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }

    public static void sayHelloToAnimal(Animal animal) {
        System.out.print(animal.getName() + " says: ");
        animal.sayHello();
    }
}
