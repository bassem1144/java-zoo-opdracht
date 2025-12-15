package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;

public class Giraffe extends Animal implements Herbivore {
    public String helloText;
    public String eatText;

    public Giraffe(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "*giraffe noises*";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch from tall trees";
        System.out.println(eatText);
    }
}


