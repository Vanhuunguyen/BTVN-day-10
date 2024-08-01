package BTVNday10;

import ngay9.SinhVien;

import java.util.Scanner;

public class sinhVienInfor {

    public static void main(String[] args) {
        sinhvien sv1 = new sinhvien();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sinh vien 1");
        sv1.setMaSinhVien(sc.nextInt());
        System.out.println("nhap ten sinh vien 1");
        sc.next();
        sv1.setName(sc.nextLine());
        System.out.println("nhap diem ly thuyet");
        sv1.setDiemLyThuyet(sc.nextDouble());
        System.out.println("nhap diem thuc hanh");
        sv1.setDiemThucHanh(sc.nextDouble());

        sinhvien sv2 = new sinhvien();
        System.out.println("nhap ma sinh vien 2");
        sv2.setMaSinhVien(sc.nextInt());
        System.out.println("nhap ten sinh vien 2");
        sc.next();
        sv2.setName(sc.nextLine());
        System.out.println("nhap diem ly thuyet");
        sv2.setDiemLyThuyet(sc.nextDouble());
        System.out.println("nhap diem thuc hanh");
        sv2.setDiemThucHanh(sc.nextDouble());

        sinhvien sv3 = new sinhvien();
        System.out.println("nhap ma sinh vien 3");
        sv3.setMaSinhVien(sc.nextInt());
        System.out.println("nhap ten sinh vien 3");
        sc.next();
        sv3.setName(sc.nextLine());
        System.out.println("nhap diem ly thuyet");
        sv3.setDiemLyThuyet(sc.nextDouble());
        System.out.println("nhap diem thuc hanh");
        sv3.setDiemThucHanh(sc.nextDouble());
        sv1.printInfor();
        sv2.printInfor();
        sv3.printInfor();
    }
}
