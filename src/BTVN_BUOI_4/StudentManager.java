package BTVN_BUOI_4;

import java.util.*;

public class StudentManager {
    static Scanner sc = new Scanner(System.in);
    static Student[] s = new Student[0];

    public static void menu() {
        int choose;
        do {
            System.out.println("___________MENU__________");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên khỏi danh sách");
            System.out.print("Chọn thao tác (0 để thoát): ");
            choose = sc.nextInt();

            switch (choose) {
                case 1 -> addStudent();
                case 2 -> fixStudent();
                case 3 -> {
                    sortByAge();
                    printStudents();
                }
                case 4 -> {
                    sortByGPA();
                    printStudents();
                }
                case 5 -> {
                    sortByAbsences();
                    printStudents();
                }
                case 6 -> deleteStudent();
            }
        } while (choose != 0);
    }

    public static void addStudent() {
        sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Năm sinh: ");
        int year = sc.nextInt(); sc.nextLine();
        System.out.print("Địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Điểm TX1: ");
        double tx1 = sc.nextDouble();
        System.out.print("Điểm TX2: ");
        double tx2 = sc.nextDouble();
        System.out.print("Điểm KTHP: ");
        double kthp = sc.nextDouble();
        System.out.print("Số tiết nghỉ: ");
        int rest = sc.nextInt();

        Student newStudent = new Student(name, year, address, tx1, tx2, kthp, rest);
        Student[] newArray = Arrays.copyOf(s, s.length + 1);
        newArray[s.length] = newStudent;
        s = newArray;
        System.out.println("Đã thêm sinh viên!");
    }

    public static void deleteStudent() {
        sc.nextLine();
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String name = sc.nextLine();
        boolean found = false;
        List<Student> temp = new ArrayList<>();
        for (Student st : s) {
            if (!st.getName().equalsIgnoreCase(name)) {
                temp.add(st);
            } else {
                found = true;
            }
        }
        if (found) {
            s = temp.toArray(new Student[0]);
            System.out.println("Đã xóa sinh viên.");
        } else {
            System.out.println("Không tìm thấy sinh viên tên \"" + name + "\".");
        }
    }

    public static void fixStudent() {
        sc.nextLine();
        System.out.print("Nhập tên sinh viên cần sửa: ");
        String name = sc.nextLine();
        for (Student st : s) {
            if (st.getName().equalsIgnoreCase(name)) {
                System.out.print("Sửa thông tin nào (ten / nam sinh / dia chi / tx1 / tx2 / kthp / so tiet nghi): ");
                String field = sc.nextLine();
                switch (field) {
                    case "ten" -> {
                        System.out.print("Tên mới: ");
                        st.setName(sc.nextLine());
                    }
                    case "nam sinh" -> {
                        System.out.print("Năm sinh mới: ");
                        st.setYearOfBirth(sc.nextInt()); sc.nextLine();
                    }
                    case "dia chi" -> {
                        System.out.print("Địa chỉ mới: ");
                        st.setAddress(sc.nextLine());
                    }
                    case "tx1" -> {
                        System.out.print("Điểm TX1 mới: ");
                        st.setDiemTX1(sc.nextDouble()); sc.nextLine();
                    }
                    case "tx2" -> {
                        System.out.print("Điểm TX2 mới: ");
                        st.setDiemTX2(sc.nextDouble()); sc.nextLine();
                    }
                    case "kthp" -> {
                        System.out.print("Điểm KTHP mới: ");
                        st.setDiemKTHP(sc.nextDouble()); sc.nextLine();
                    }
                    case "so tiet nghi" -> {
                        System.out.print("Số tiết nghỉ mới: ");
                        st.setSoTietNghi(sc.nextInt()); sc.nextLine();
                    }
                    default -> System.out.println("Trường không hợp lệ!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên tên \"" + name + "\".");
    }

    public static void printStudents() {
        System.out.println("\n--- Danh sách sinh viên ---");
        for (Student st : s) {
            System.out.println(st);
        }
    }

    public static void sortByAge() {
        Arrays.sort(s, Comparator.comparingInt(Student::getYearOfBirth));
    }

    public static void sortByGPA() {
        Arrays.sort(s, (a, b) -> Double.compare(b.getGPA(), a.getGPA()));
    }

    public static void sortByAbsences() {
        Arrays.sort(s, (a, b) -> Integer.compare(b.getSoTietNghi(), a.getSoTietNghi()));
    }
}
