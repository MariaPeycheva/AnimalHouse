package com.company;

public class Bunny extends Animal{
    public double heighOfJump;

    public Bunny() {
        this.heighOfJump = 0.0;
    }
    public Bunny(double heighOfJump) {
        this.heighOfJump = heighOfJump;
    }

    public double getHeighOfJump() {
        return heighOfJump;
    }

    public void setHeighOfJump(double heighOfJump) {
        this.heighOfJump = heighOfJump;
    }
}