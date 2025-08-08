package Buoi_5;

public class Pet {


    private final double overWeight =10;
    private String name;
    private double weight;
    private String species;

    public  Pet () {

    }

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void printInFo () {
        System.out.println( "ten loai: " + this.name+ " loai: " + this.species + " can nang: " + this.weight);
    }

    public boolean check () {
        if (this.weight > overWeight){
            return true;
        }
        return false;
    }

    public String getBasicInFo() {
        return "ten loai: " + this.name + " loai: " + this.species;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "overWeight=" + overWeight +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}

