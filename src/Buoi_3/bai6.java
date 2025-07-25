package Buoi_3;

import java.util.Scanner;

public class bai6 {
    public static String daoNguoc(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String s) {
        String reversed = daoNguoc(s);
        return s.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();
        String trimmed = input.trim();

        String reversed = daoNguoc(trimmed);

        if (isPalindrome(trimmed)) {
            String inHoa = trimmed.toUpperCase();
            System.out.println("Chuỗi: " + inHoa);
            System.out.println("Là chuỗi đối xứng.");
        } else {
            String inThuong = trimmed.toLowerCase();
            System.out.println("Chuỗi: " + inThuong);
            System.out.println("Không phải chuỗi đối xứng.");
        }

        System.out.println("Chuỗi đảo ngược là: " + reversed);

        sc.close();
    }
}
