package Buoi_7.bai1;

import Buoi_7.bai2.Book;

import java.util.*;

public class Main {
    public static void main (String [] args){


        Shape[] shapes = new Shape [3];
        shapes [0] = new Circle(3.5);
        shapes [1] = new Rectangle(3, 4);
        shapes [2] = new Circle(4);
        System.out.println("----Area of shape---- ");
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " area = " + s.area());
        }


        ArrayList<Movable> movables = new ArrayList<>();
        movables.add(new Car());
        movables.add(new Bike());
        System.out.println("----Car---- ");
        for (Movable m : movables) {
            m.move();
        }


        Animal[] animals = {new Dog(), new Cat(), new Bird()};
        System.out.println("----Animal Sounds---- ");
        for (Animal a : animals) {
            a.makeSound();
        }

    }
}
