package BTVN_Buoi_7.Bai_2_va_3;

public interface StudentManagerInterface {

    void sortByScoreDesc();

    void sortByScoreAsc();

    Student findByName(String name);

    void printStudents();
}