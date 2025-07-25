package Buoi_3;

import java.util.Random;
import java.util.Scanner;

public class bai7 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int a = rand.nextInt(101);
        int b = rand.nextInt(101);

        boolean isCorrect = rand.nextBoolean();

        int c;
        if (isCorrect) {
            c = a + b;
        } else {
            do {
                c = rand.nextInt(201); // [0, 200]
            } while (c == a + b);
        }

        System.out.println("Phép toán của bạn là:");
        System.out.println(a + " + " + b + " = " + c);

        System.out.print("Dự đoán kết quả của phép toán (dung/sai): ");
        String userInput = sc.nextLine().trim().toLowerCase();

        boolean userAnswer = userInput.equals("dung");

        if (userAnswer == isCorrect) {
            System.out.println("Bạn dự đoán đúng");
        } else {
            System.out.println("Bạn dự đoán sai");
        }

        sc.close();
    }
}
