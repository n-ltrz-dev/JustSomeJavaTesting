package org.example.tier;

public class Koala extends Tier implements ISound{
    public Koala(String name, int age) {
        super(name, age, "Koala");
    }

    @Override
    public void drinking() {
        System.out.println(name + " the " + type + " is drinking!");
    }
    @Override
    public void eating() {
        System.out.println(name + " the " + type + " is drinking!");
    }

    public void makeSound() {
        System.out.println("Mmpf, i am a Koala!!");
    }
}

