package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;

import java.util.Random;

public class Zebra extends Animal implements Herbivore {
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
