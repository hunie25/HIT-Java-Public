package BTVN_BUOI_5;

import java.util.Scanner;

public class Student {
    private String name;
    private String lop;
    private double score;
    private Faculty y;

    public Student(String name, String lop, double score, Faculty faculty) {
        this.name = name;
        this.lop = lop;
        this.score = score;
        this.y = y;
    }

    public Student() {
        y = new Faculty();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten hoc sinh: ");
        name = sc.nextLine();
        System.out.println("Lop: ");
        lop = sc.nextLine();
        System.out.println("Diem: ");
        score = sc.nextDouble();
        System.out.println("Thong tin khoa: ");
        y.input();
    }

    public void output() {
        System.out.println("Ten hoc sinh: " + this.name);
        System.out.println("Lop: " + this.lop);
        System.out.println("Diem; " + this.score);
        y.output();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getFaculty() {
        return y;
    }

    public void setFaculty(Faculty faculty) {
        this.y = y;
    }
}
