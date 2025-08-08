package BTVN_BUOI_5;

import java.util.Scanner;

public class School {

    private String name;
    private String date;


    public School(String name, String date) {
        this.name = name;
        this.date =date;
    }

    public School (){

    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten truong; ");
        name = sc.nextLine();
        System.out.println("Ngay vao truong; ");
        date = sc.nextLine();
    }

    public void output(){
        System.out.println("Truong: " + this.name);
        System.out.println("Ngay vao truong: " + this.date);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
