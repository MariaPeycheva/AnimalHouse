package com.company;

public class Fish extends Animal{
    public String name;

    public Fish() {
        this.name = "";
    }

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
