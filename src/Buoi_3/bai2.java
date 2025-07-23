package Buoi_3;
import java.util.Scanner;
public class bai2 {
    public static final double PI = 3.14159265;
    public static double tinhC (double r){
        return 2 * PI * r;
    }
    public static double tinhS (double r){
        return r * r * PI;
    }
    public static double tinhMu (double r, int k){
        return Math.pow(r,k);
    }
    public static double tinhCBH (double r, int k){
        return Math.sqrt(r + k);
    }
    public static double tinhTTD (double r, int k){
        return Math.abs(r - k);
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        double r = sc.nextDouble();
        System.out.println("nhap k: ");
        int k = sc.nextInt();

        double C = tinhC(r);
        double S = tinhS(r);
        double mu = tinhMu(r, k);
        double CBH = tinhCBH(r, k);
        double TTD = tinhTTD(r, k);

        System.out.println("chu vi hinh tron la: " + C);
        System.out.println("dien tich hinh tron la: " + S);
        System.out.println("r mu k: " + mu);
        System.out.println("can bac hai cua (r + k): " + CBH);
        System.out.println("tri tuyet doi cua (r - k): " + TTD);

        sc.close();
    }

}
