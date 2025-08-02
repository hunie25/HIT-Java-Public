package BTVN_BUOI_4;

public class Student {
    private String name;
    private int yearOfBirth;
    private String address;
    private double diemTX1;
    private double diemTX2;
    private  double diemKTHP;
    private int soTietNghi;

    public Student (){

    }

    public Student (String name, int yearOfBirth, String address, double diemTX1, double diemTX2, double diemKTHP, int soTietNghi ){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.diemTX1 = diemTX1;
        this.diemTX2 = diemTX2;
        this.diemKTHP = diemKTHP;
        this.soTietNghi = soTietNghi;
    }

    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name =name;
    }

    public int getYearOfBirth () {
        return this.yearOfBirth;
    }
    public void setYearOfBirth (int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress () {
        return this.address;
    }
    public void setAddress (String address) {
        this.address = address;
    }

    public double getDiemTX1 () {
        return this.diemTX1;
    }
    public void setDiemTX1 (double diemTX1) {
        this.diemTX1= diemTX1;
    }

    public double getDiemTX2 () {
        return this.diemTX2;
    }
    public void setDiemTX2 (double diemTX2) {
        this.diemTX2 = diemTX2;
    }

    public double getDiemKTHP () {
        return this.diemKTHP;
    }
    public void setDiemKTHP (double diemKTHP) {
        this.diemKTHP = diemKTHP;
    }

    public int getSoTietNghi () {
        return this.soTietNghi;
    }
    public void setSoTietNghi (int s) {
        this.soTietNghi = soTietNghi;
    }

    public int getAge (){
        return java.time.Year.now().getValue() - yearOfBirth;
    }

    public double getGPA () {
        return diemTX1 * 0.2 + diemTX2 * 0.3 + diemKTHP * 0.5;
    }
}


