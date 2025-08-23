package Buoi_7.bai2;

import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        Book [] books = new Book[3];

        try {
            for(int i = 0; i < books.length; i++){
                System.out.println("Nhap ten cuon sach thu " + (i + 1) + ": " );
                System.out.println("Nhap tieu de: ");
                String bookTitle = sc.nextLine();
                System.out.println("Nhap ten tac gia: ");
                String bookAuthor = sc.nextLine();

                books[i] = new Book(bookTitle, bookAuthor);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < books.length; i++)
            System.out.println(books[i].toString());
    }
}
