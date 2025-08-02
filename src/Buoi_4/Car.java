package Buoi_4;

public class Car {

    private String brand;
    private int maxSpeed ;

    public Car (){

    }

    public Car (String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand () {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int speed) {
        this.maxSpeed = maxSpeed;
    }

    public static final int MaxSpeed = 90;
    public void run (){

        System.out.println("Xe " + brand + " dang chay voi toc do toi da " + maxSpeed + " km/h");
        if (this.maxSpeed > MaxSpeed){
            System.out.println("xe chay qua toc do cho phep");
        }
        else {
            System.out.println("xe khong vuot qua toc do cho phep");
        }
    }
}
