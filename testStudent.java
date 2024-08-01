package BTVNday10;

import java.util.HashSet;
import java.util.Set;

public class testStudent {
    public static void main(String[] args) {
        Set<Student> SinhVien = new HashSet<>();
        Student sv1 = new Student(1,"huy",2);
        Student sv2 = new Student(2,"nam",3);
        Student sv3 = new Student(3,"hoa",4);
        Student sv4 = new Student(4,"mai",5);
        Student sv5 = new Student(5,"ly",6);
        SinhVien.add(sv1);
        SinhVien.add(sv2);
        SinhVien.add(sv3);
        SinhVien.add(sv4);
        SinhVien.add(sv5);
        SinhVien.add(sv1);
        for (Student sinhvien:SinhVien){
            System.out.println(SinhVien);
        }
    }
}
//vi trong set k the co cac phan tu trung nhau nen khong the them doi tuong giong 100% vao duoc
