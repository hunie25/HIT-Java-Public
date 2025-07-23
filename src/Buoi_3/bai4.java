package Buoi_3;

import java.util.Scanner;

public class bai4 {
    public static int fibonacci (int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b  = 1, fib = 1;
        for (int i = 2; i <= n; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void  main (String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int tongLe = 0;
        System.out.println("day fabonacci tu F0 deb F"+ n+": ");
        for (int i = 0; i <= n; i++){
            int fib = fibonacci(i);
            System.out.println(fib + " ");
            if (fib % 2 != 0){
                tongLe += fib;
            }
        }
        System.out.println("\n tong cac so fibonacci le la: "+ tongLe);
        sc.close();
    }
}
