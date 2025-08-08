package Buoi_5;

import java.util.ArrayList;

public class Cage {

    private final int MAX_CAPACITY = 3;
    private String cageCode;
    private ArrayList<Pet> pets = new ArrayList<>();
    private int currentPetCount = 0;
    private static int totalCages;

    public Cage(String cageCode, int currentPetCount) {
        this.cageCode = cageCode;
        this.currentPetCount = currentPetCount;
    }

    public Cage() {
        this.pets = new ArrayList<>();
    }

    public Cage(int currentPetCount, ArrayList<Pet> pets, String cageCode) {
        this.currentPetCount = currentPetCount;
        this.pets = pets != null ? pets : new ArrayList<>();
        this.cageCode = cageCode;
    }

    public void addPet(Pet pet) {
        if (currentPetCount < MAX_CAPACITY) {
            pets.add(pet);
            currentPetCount++;
        }
    }




    public void printAllPets() {
        for (Pet x : pets) {
            System.out.println(x);
        }
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
        this.currentPetCount = pets != null ? pets.size() : 0;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public static void setTatolcages (int totalCages) {
        Cage.totalCages = totalCages;

    }
    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }
}
