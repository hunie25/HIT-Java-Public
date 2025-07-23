package Buoi_3;
import java.util.Scanner;
public class bai1 {

    public static boolean isPrime (int n){
        if ( n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("nhap cac so nguyen");
        for (int i = 0; i < n; i++){
            System.out.println("so thu " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int tongChan = 0;
        int tongLe = 0;
        int dem = 0;

        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                tongChan += arr[i];
            } else {
                tongLe += arr[i];
            }
            if (isPrime(arr[i])){
                dem++;
            }
        }
        System.out.println("tong cac so chan la: " + tongChan);
        System.out.println("tong cac so le la: " + tongLe);
        System.out.println("so cac so nguyen to la: " + dem);
        sc.close();
    }
}
