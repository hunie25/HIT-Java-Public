package Buoi_3;
import java.util.Scanner;
public class bai8 {

    public static int[][] generateSpiral(int n) {
        int[][] a = new int[n][n];
        int num = 1;
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;

        while (num <= n * n) {
            for (int i = colStart; i <= colEnd; i++){
                a[rowStart][i] = num++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                a[i][colEnd] = num++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                a[rowEnd][i] = num++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                a[i][colStart] = num++;
            }
            colStart++;
        }
        return a;
    }

    public static void display(int[][] a) {
        System.out.println("Ma trận:");
        for (int[] row : a) {
            for (int x : row) System.out.printf("%4d", x);
            System.out.println();
        }
    }

    public static int diagonalSum(int[][] a) {
        int n = a.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][i] + a[i][n - 1 - i];
        }
        if (n % 2 == 1) sum -= a[n / 2][n / 2];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập kích thước ma trận n: ");
        int n = sc.nextInt();

        int[][] matrix = generateSpiral(n);

        display(matrix);
        System.out.println("Tổng đường chéo la: " + diagonalSum(matrix));

        sc.close();
    }
}
