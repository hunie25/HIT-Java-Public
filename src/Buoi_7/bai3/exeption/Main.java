package Buoi_7.bai3.exeption;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static int a;
    public static int b;

    public static int inputInteger() {
        int num = 0;
        boolean isValid;
        do {
            try {
                System.out.println("Nhap so nguyen: ");
                num = Integer.parseInt(sc.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                isValid = false;
                System.out.println("Nhap lai");
            }
        } while (!isValid);
        return num;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Nhap so nguyen a: ");
            a = inputInteger();
            System.out.println("Nhap so nguyen b: ");
            b = inputInteger();

            int c = a/b;
            System.out.println("a/b= " + c);
        } catch (ArithmeticException e) {
            System.out.println("Khong the chia cho 0!");
        }
    }
}
