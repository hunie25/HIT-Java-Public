package Buoi_6;

public class LopHoc {

    private String maLop;
    private String tenLop;


    public LopHoc(String maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public LopHoc(){

    }

    public void inThongTin(){
        System.out.println("thong tin lop hoc: " + "\n" + "Ma lop: " +  this.maLop + "\n" + "Ten lop; " + this.tenLop );
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
}
