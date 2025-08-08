package BTVN_BUOI_5;

import java.util.Scanner;

public class May {

    private String maMay;
    private String tenMay;
    private String tinhTrang;

    Scanner sc = new Scanner(System.in);


    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay =maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public May() {

    }

    public void input() {;
        System.out.println("Ma may: ");
        maMay = sc.nextLine();
        System.out.println("Ten may; ");
        tenMay = sc.nextLine();
        System.out.println("Tinh trang: ");
        tinhTrang = sc.nextLine();
    }

    public void output() {
        System.out.println("May: " + this.tenMay);
        System.out.println("Ma may: " + this.maMay);
        System.out.println("Tinh trang: " + this.tinhTrang);
    }


    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
