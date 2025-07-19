package Buoi_2;

import java.util.Scanner;

public class bai1_thuat_toan {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14;
        double C = 2 * r * pi;
        double S = r * r * pi;
        System.out.printf("%.3f %.3f", C, S);
        sc.close();
    }
}
