package Buoi_2;

import java.util.Scanner;

public class bai6 {
    static class SinhVien {
        String name;
        int age;
        double gpa;

        public SinhVien (String name, int age, double gpa){
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien[] list = new SinhVien[n];
        for (int i=0; i<n; i++) {
            System.out.println("nhap ten cua sinh vien thu " + (i + 1) + ": ");
            System.out.println("Ten: ");
            String name = sc.nextLine();
            System.out.println("Tuoi: ");
            int age = sc.nextInt();
            System.out.println("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();
            list[i] = new SinhVien(name, age, gpa);
        }

        // in ra danh sach sinh vien
        System.out.println("Danh sach sinh vien: ");
        for (SinhVien sv: list) {
            System.out.println("Ten: "+ sv.name+" Tuoi: "+sv.age+" GPA: "+sv.gpa);
        }

        // tinh tbc diem cua tat ca sinh vien
        double tongdiem = 0;
        for (SinhVien sv: list){
            tongdiem += sv.gpa;
        }
        double TBC = tongdiem/n;
        System.out.println("TBC diem cua tat ca sinh vien la: "+TBC);

        //Tim sinh vien co diem cao nhat
        SinhVien svMax = list[0];
        for (SinhVien sv: list){
            if (sv.gpa > svMax.gpa){
                svMax = sv;
            }
        }
        System.out.println("sinh vien co diem cao nhat la:");
        System.out.println("Ten: "+svMax.name+" Tuoi: "+svMax.age+" GPA: "+svMax.gpa);
    }
}
