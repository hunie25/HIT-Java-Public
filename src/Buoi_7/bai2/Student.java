package Buoi_7.bai2;

public class Student {

    private String id;
    private String name;
    private int age;


    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void printInFo(){
        System.out.println("Ma sinh vien: " + this.id);
        System.out.println("ten: " + this.name);
        System.out.println("tuoi: " + this.age);
    }

    public Student (){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

