package Buoi_2;

import java.util.Scanner;

public class bai3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen a = ");
        int a = sc.nextInt();
        System.out.println("nhap so nguyen b = ");
        int b = sc.nextInt();
        System.out.println("tong a + b = " + (a+b));
        System.out.println("hieu a - b = " + (a-b));
        System.out.println("tich a * b = " + (a*b));
        System.out.println("thuong a / b = " + (a/b));
        System.out.println("ket qua phep chia lay du a % b = " + (a%b));
        if (a == b){
            System.out.println ("a = b");
        } else if (a > b) {
            System.out.println ("a lớn hơn b");
        } else
            System.out.println ("a bé hơn b");
    }
}
