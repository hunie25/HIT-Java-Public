package Buoi_4;

public class Student {

    private String name;
    private int age;

    public Student(){

    }
    public Student(int age, String name){
        this.name = name;
        this.age = age;
    }


    public String getName (){
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public int getAge (){
        return this.age;
    }
    public void setAge (int age){
        this.age = age;
    }

    public void sayHello (){
        System.out.println("Xin chao, toi la " + name + " nam nay toi " + age +" tuoi");
    }
}

