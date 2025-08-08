package Buoi_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dogA", 15, "Dog");
        pet.printInFo();

        Cage a = new Cage();
        Cage b = new Cage();

       Pet dogA = new Pet("ABC1", 20, "dog");
       Pet dogB = new Pet("ABC2", 10, "pig");
       Pet dogC = new Pet("ABC3", 15, "cat");

       ArrayList<Pet> petArrayList = new ArrayList<>();
       petArrayList.add(dogA);
       petArrayList.add(dogB);
       petArrayList.add(dogC);

       ArrayList<Pet> petArrayListA = new ArrayList<>();

       System.out.println("so long da tao: " + b.getTotalCages());

       
    }
}
