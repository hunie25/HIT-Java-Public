package Buoi_6;

public class SinhVien {

    private String maSv;
    private String hoTen;
    private double diemTB;
    private LopHoc lop;


    public SinhVien(String maSv, String hoTen, double diemTB, LopHoc lop) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public SinhVien(){

    }

    public void inThongTin(){
        System.out.println("thong tin sinh vien: " + "\n" + "ma sinh vien: " + this.maSv + "\n" + "Ho ten: " + this.hoTen + "\n"  + "diem trung binh: " + this.diemTB );
        this.lop.inThongTin();
        System.out.println("--------------------");
    }




    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }
}
