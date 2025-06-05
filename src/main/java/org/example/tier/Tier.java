package org.example.tier;

public class Tier {
    public String name;
    public int age;
    public String type;

    public Tier(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void drinking() {
        System.out.println(name + " the " + type + " is drinking!");
    }

    public void eating() {
        System.out.println(name + " the " + type + " is eating!");
    }

}
