package org.example.tier;

public class Clownfish extends Tier implements ISound {
    public Clownfish(String name, int age) {
        super(name, age, "Clownfish");
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
        System.out.println("Blubb blubb!!");
    }
}
