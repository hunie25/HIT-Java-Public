package Buoi_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        /*
         bai 1 tren lop
        ArrayList<SinhVien> newArray = new ArrayList<>();
        newArray.add(new SinhVien("001", "hoa", 9.2, new LopHoc("A", "HTTT")));
        newArray.add(new SinhVien("002", "nguyen", 8.0, new LopHoc("B", "CNTT")));
        newArray.add(new SinhVien("003", "phuong", 7.2, new LopHoc("C", "HTTT")));
        newArray.add(new SinhVien("004", "nguyen", 5.0, new LopHoc("D", "CNTT")));

        for (int i = 0; i < newArray.size(); i++) {
            newArray.get(i).inThongTin();
        }
         */

        NhanVien a = new NhanVienFullTime("001", "Phuong", 20, "phuong@gmail.com", "0837372543", 4500, 174);
        NhanVien b = new NhanVienFullTime("002", "Nguyen", 20, "nguyen@gmail.com", "0837592543", 7000, 200);
        NhanVien c = new NhanVienPartTime("003", "Vu", 18, "vu@gmail.com", "0837537943", 50, 36);
        NhanVien d = new NhanVienPartTime("004", "Phong", 22, "phong@gmail.com", "0275032543", 37, 40);

        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();

        quanLyNhanVien.themNhanVien(a);
        quanLyNhanVien.themNhanVien(b);
        quanLyNhanVien.themNhanVien(c);
        quanLyNhanVien.themNhanVien(d);

        quanLyNhanVien.hienThiThongTin();

        double totalSalary = quanLyNhanVien.tinhTongLuong();
        System.out.println("Tong luong cua nhan vien la: " + totalSalary);

    }
}
