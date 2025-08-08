package BTVN_BUOI_5;

import java.util.Scanner;

public class PhongMay {


    private String maPhong;
    private String tenPhong;
    private double dienTich;
    QuanLy x;
    May[] y;
    private Integer n;


    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May[] y, Integer n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public PhongMay (){

    }

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Ma phong: ");
        maPhong = sc.nextLine();
        System.out.println("Ten phong; ");
        tenPhong = sc.nextLine();
        System.out.println("Dien tich: ");
        dienTich = sc.nextDouble();
        sc.nextLine();
        x = new QuanLy();
        x.input();
        System.out.println("So luong may: ");
        n = sc.nextInt();
        sc.nextLine();
        y = new May[n];
        for (int i = 0; i < n; i++){
            y [i] = new May();
            System.out.println("nhap thong tin may " + (i+1)+ ": ");
            y [i] = new May();
            y [i].input();
        }

    }

    public void output() {
        System.out.println("Ma phong: " + this.maPhong);
        System.out.println("Ten phong: " + this.tenPhong);
        System.out.println("Dien tich: " + this.dienTich + "(m2)");
        System.out.println("---------------");
        x.output();
        System.out.println("_______________");
        for (May m : y){
            m.output();
            System.out.println("-------------------");
        }
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}
