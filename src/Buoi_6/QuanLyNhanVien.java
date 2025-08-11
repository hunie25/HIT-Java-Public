package Buoi_6;

import java.util.ArrayList;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien;

    public QuanLyNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public QuanLyNhanVien() {
        this.danhSachNhanVien = new ArrayList<>();
    }


    public void themNhanVien(NhanVien nv) {
        this.danhSachNhanVien.add(nv);
        System.out.println("them thanh cong");

    }

    public void hienThiThongTin() {
        System.out.println("danh sach nhan vien:");
        for (NhanVien a : danhSachNhanVien) {
            a.hienThiThongTin();
        }
    }

    public double tinhTongLuong() {
        double total = 0;
        for (NhanVien a : danhSachNhanVien) {
            total += a.tinhLuong();
        }
        return total;
    }


        public void setDanhSachNhanVien (ArrayList < NhanVien > danhSachNhanVien) {
            this.danhSachNhanVien = danhSachNhanVien;
        }

        public ArrayList<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }
}