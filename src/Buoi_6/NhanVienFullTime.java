package Buoi_6;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(String maNv, String ten, int tuoi, String email, String soDienThoai, double luongCoBan, double tienThuong) {
        super(maNv, ten, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public NhanVienFullTime(double luongCoBan, double tienThuong) {
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    @Override
    public double tinhLuong(){
        return this.luongCoBan + this.tienThuong;
    }

    @Override
    public void hienThiThongTin(){
        System.out.println("Nhan vien: " + this.ten + "\n" + "ma nhan vien: " + this.maNv + "\n" +"Tuoi: " + this.tuoi + "/\n" + "Email: " + this.email + "\n" + "So dien thoai: " + this.soDienThoai + "\n" + "Luong: " + this.tinhLuong() + "\n" + "Loai: Full time");
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
}
