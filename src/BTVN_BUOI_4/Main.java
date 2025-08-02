package BTVN_BUOI_4;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Phuong", 2006, "Ninh Binh", 9, 8.5, 7, 2);
        students[1] = new Student("Phong", 2002, "Ha Noi", 5, 8, 7.5, 0);
        students[2] = new Student("Nguyen", 2010, "Nghe An", 10, 9.5, 9, 1);
        students[3] = new Student("Hoa", 2000, "Bac Ninh", 4, 7.5, 5, 3);
        students[4] = new Student("Ngoc", 2004, "Hai Phong", 5.5, 8, 9, 0);

        System.out.printf("%-10s%-8s%-15s%-12s%-12s%-14s%-10s%-12s%n",
                "Tên", "Tuổi","Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Nghỉ");

        for (Student s : students) {
            System.out.printf("%-10s%-8d%-15s%-12.1f%-12.1f%-14.1f%-10.2f%-12d%n",
                    s.getName(),
                    s.getAge(),
                    s.getAddress(),
                    s.getDiemTX1(),
                    s.getDiemTX2(),
                    s.getDiemKTHP(),
                    s.getGPA(),
                    s.getSoTietNghi()
            );
        }
        StudentManager.menu();

    }
}