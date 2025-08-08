package BTVN_BUOI_5;

import java.util.Scanner;

public class QuanLy {

    private String maQL;
    private String hoTen;

    Scanner sc = new Scanner(System.in);


    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public QuanLy(){

    }

    public void input() {
        System.out.println("Ma quan ly;");
        maQL = sc.nextLine();
        System.out.println("Ho ten: ");
        hoTen = sc.nextLine();
    }

    public void output(){
        System.out.println("Ma quan ly; " + this.maQL);
        System.out.println("Ho ten: " + this.hoTen);
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
