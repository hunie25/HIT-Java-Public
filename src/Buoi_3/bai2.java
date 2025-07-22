package Buoi_3;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập bán kính r: ");
        double r = sc.nextDouble();
        System.out.print("Nhập số mũ k: ");
        int k = sc.nextInt();

        double C = 2 * PI * r;
        double S = PI * r * r;
        double luyThua = Math.pow(r, k);
        double canHai = Math.sqrt(r + k);
        double triTuyetDoi = Math.abs(r - k);

        System.out.printf("Chu vi hình tròn: %.4f\n", C);
        System.out.printf("Diện tích hình tròn: %.4f\n", S);
        System.out.printf("r^k: %.4f\n", luyThua);
        System.out.printf("Căn bậc hai của (r + k): %.4f\n", canHai);
        System.out.printf("Giá trị tuyệt đối của (r - k): %.4f\n", triTuyetDoi);

        sc.close();
    }

}
