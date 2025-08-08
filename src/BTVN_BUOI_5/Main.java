package BTVN_BUOI_5;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
/* Bai 1
        System.out.println("So hoc sinh: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap thong tin cua hoc sinh thu " + (i+1));
            students [i] = new Student();
            students [i].input();
        }

        System.out.println("Thong tin sinh vien: ");
        for (Student st : students){
            st.output();
            System.out.println("-------------------");}
*/
        System.out.println("Thong tin phong may: ");
        PhongMay phongMay = new PhongMay();
        phongMay.input();
        phongMay.output();
        sc.close();
    }
}
