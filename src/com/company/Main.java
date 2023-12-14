package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Bunny bunny = new Bunny();

        AnimalHouse<Animal> animalHouse = new AnimalHouse<>();
        animalHouse.animal = fish;
        animalHouse.animal = bunny;


        AnimalHouse<Fish> fishHouse = new AnimalHouse<>();
        fishHouse.animal=fish;

        AnimalHouse<Bunny> bunnyHouse = new AnimalHouse<>();
        bunnyHouse.animal=bunny;

    }
}
