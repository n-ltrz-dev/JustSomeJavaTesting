package org.example.tier;

public class Kolibri extends Tier implements ISound{
    public Kolibri(String name, int age) {
        super(name, age, "Kolibri");
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
        System.out.println("Mmpf, i am a fast and small Kolibri!");
    }
}
