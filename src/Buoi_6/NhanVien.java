package Buoi_6;

public class NhanVien {
    public String maNv;
    public String ten;
    public int tuoi;
    public String email;
    public String soDienThoai;


    public NhanVien(String maNv, String ten, int tuoi, String email, String soDienThoai) {
        this.maNv = maNv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public NhanVien(){

    }

    public double tinhLuong(){
        return 0;
    }

    public void hienThiThongTin(){
        System.out.println("Nhan vien: " + ten + "\n" + "ma nhan vien: " + maNv + "\n" +"Tuoi: " + tuoi + "/\n" + "Email: " + email + "\n" + "So dien thoai: " + soDienThoai + "\n" + "Luong: " + tinhLuong());
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
