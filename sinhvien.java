package BTVNday10;

public class sinhvien {
    private int maSinhVien;
    private String name;
    private double diemLyThuyet;
    private double diemThucHanh;
    protected sinhvien(){};

    public sinhvien(int maSinhVien, String name, double diemLyThuyet, double diemThucHanh) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getName() {
        return name;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }
    public double diemTrungBinh(){
        return (this.diemLyThuyet+this.diemThucHanh)/2;
    }

    @Override
    public String toString() {
        return "sinhvien{" +
                "maSinhVien=" + maSinhVien +
                ", name='" + name + '\'' +
                ", diemLyThuyet=" + diemLyThuyet +
                ", diemThucHanh=" + diemThucHanh +
                ", diemTrungBinh=" + diemTrungBinh() +
               '}';
    }
    public void printInfor(){
        System.out.println(toString());
    }
}
