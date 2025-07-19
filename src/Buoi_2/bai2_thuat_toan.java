package Buoi_2;

import java.util.Scanner;

public class bai2_thuat_toan {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i<n; i++){
            if (i%2==1){
                int trai = (i>0) ? a[i-1]:0;
                int phai = (i<n-1) ? a[i+1]:0;
                a[i] += Math.abs(trai-phai);
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(a[i]);
            if (i<n-1){
                System.out.print(" ");
            }
        }
    }
}