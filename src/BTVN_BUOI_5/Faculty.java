package BTVN_BUOI_5;

import java.util.Scanner;

public class Faculty {

    private String name;
    private String date;
    private School x;


    public Faculty(String name, String date, School school) {
        this.name = name;
        this.date = date;
        this.x = x;
    }

    public Faculty() {
        x = new School();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten khoa ");
        name = sc.nextLine();
        System.out.println("Ngay vao khoa: ");
        date = sc.nextLine();
        System.out.println("Thong tin truong:");
        x.input();
    }

    public void output(){
        System.out.println("Khoa: " + this.name);
        System.out.println("Ngay vao khoa: " + this.date);
        x.output();
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

    public School getSchool() {
        return x;
    }

    public void setSchool(School school) {
        this.x = x;
    }
}
