package org.example;

public class Dog extends Animal{

    Dog(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + " is swimming");
    }

}
