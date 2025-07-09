package Tuan_1;

import java.util.Scanner;

public class Bai1 {
    String id;
    static String name;
    String age;

    public String getName(){
        name = "Huyen";
        return name;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        System.out.println(ten);
        System.out.println(name);
    }
}
