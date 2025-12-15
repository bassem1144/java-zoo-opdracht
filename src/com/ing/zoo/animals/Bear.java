package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;

public class Bear extends Animal implements Carnivore, Herbivore {
    public String helloText;
    public String eatText;

    public Bear(String name) {
        super(name);
    }

    public void sayHello()
    {
        helloText = "raawwwwl";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "rawr nom nom fish";
        System.out.println(eatText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch berries and honey";
        System.out.println(eatText);
    }
}

