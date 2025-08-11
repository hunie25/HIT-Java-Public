package Buoi_6;

public class NhanVienPartTime extends NhanVien{

    private int soGioLam;
    private double luongTheoGio;


    public NhanVienPartTime(String maNv, String ten, int tuoi, String email, String soDienThoai, int soGioLam, double luongTheoGio) {
        super(maNv, ten, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public NhanVienPartTime(int soGioLam, double luongTheoGio) {
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong(){
        return this.soGioLam * this.luongTheoGio;
    }

    @Override
    public void hienThiThongTin(){
        System.out.println("Nhan vien: " + this.ten + "\n" + "ma nhan vien: " + this.maNv + "\n" +"Tuoi: " +this. tuoi + "/\n" + "Email: " + this.email + "\n" + "So dien thoai: " + this.soDienThoai + "\n" + "Luong: " + this.tinhLuong() + "\n" + "Loai: Part time");
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }
}
