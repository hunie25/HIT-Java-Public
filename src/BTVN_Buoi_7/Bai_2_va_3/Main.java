package BTVN_Buoi_7.Bai_2_va_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("SV001", "Tran Van Hoang", 7, 19, "tvh01@gmail.com", "CNTT01", "Ha Nam"));
        students.add(new Student("SV002", "Nguyen Thị Hong", 5.6, 20, "nth@gmail.com", "CNTT01", "TP. Hồ Chí Minh"));
        students.add(new Student("SV003", "Hoang Hai Nam", 9.5, 21, "hhn01@gmail.com", "CNTT01", "Nghe An"));
        students.add(new Student("SV004", "Pham Huu Duy", 6.8, 22, "phd@gmail.com", "CNTT01", "Bac Ninh"));
        students.add(new Student("SV005", "Mai Hong Ngoc", 8.0, 23, "mhn@gmail.com", "CNTT01", "Thanh Hoa"));

        StudentManager studentManager = new StudentManager(students);

        Scanner sc = new Scanner(System.in);
        char choose;

        do {
            System.out.println("===QUAN LY HOC SINH===");
            System.out.println("1. In danh sach hoc sinh");
            System.out.println("2. Sap xep theo điem giam dan");
            System.out.println("3. Sap xep theo điem tang dan");
            System.out.println("4. Tim hoc sinh theo ten");
            System.out.println("5. Thoat");
            choose = sc.next().charAt(0);

            switch(choose){
                case '1':
                    studentManager.printStudents();
                    break;
                case '2':
                    studentManager.sortByScoreDesc();
                    break;
                case '3':
                    studentManager.sortByScoreAsc();
                    break;
                case '4':
                    sc.nextLine();
                    System.out.println("Nhap ten hoc sinh muon tim: ");
                    String name = sc.nextLine();
                    Student found = studentManager.findByName(name);
                    System.out.println(found);
                    break;
                case '5':
                    System.exit(0);
                    break;
            }
        } while (choose != 5);



    }
}