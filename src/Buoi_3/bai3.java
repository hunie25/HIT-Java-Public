package Buoi_3;

import java.util.Scanner;

public class bai3 {
    public static String daoNguoc (String s){
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome (String s){
        String reversed = daoNguoc(s);
        return s.equalsIgnoreCase(reversed);
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String input = sc.nextLine();
        String trimmed = input.trim();

        if (isPalindrome(trimmed)){
            System.out.println("la chuoi doi xung");
        } else {
            System.out.println("khong phai chuoi doi xung");
        }

        String reversed = daoNguoc(trimmed);
        System.out.println("chuoi dao nguoc la: " + reversed);

        sc.close();
    }
}