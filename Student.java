package BTVNday10;
//Bài 4: Tạo 1 class Student(id, name, clazz)
//Tạo constructor, getter, setter, toString()
//Tạo 1 HashSet Student
//Thêm lần lượt 5 Student với id từ 1 đến 5, tên tùy ý, clazz tùy ý
//Thêm 1 Student có thông tin giống 100% thông tin của Student với id = 1
//Kiểm tra số lượng.
//Nhận xét về kết quả
public class Student {
    private int ID;
    private String name;
    private int clazz;
    public Student(){};

    public Student(int ID, String name, int clazz) {
        this.ID = ID;
        this.name = name;
        this.clazz = clazz;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getClazz() {
        return clazz;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
