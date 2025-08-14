package BTVN_BUOI_6;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook (Book book){
        books.add(book);
    }

    public void displayAllBooks (boolean showPublisher){
        if (books.isEmpty()){
            System.out.println("Thu vien khong co sach.");
        }
        for (Book b : books){
            b.displayInFo(showPublisher);
            System.out.println("---------------------");
        }
    }

    public void searchByAuthor (String author){
        boolean found = false;
        for (Book b : books){
            if (b.getAuthor().toLowerCase().contains(author.toLowerCase())){
                b.displayInFo(true);
                System.out.println("--------------------");
                found = true;
            }
            if (!found){
                System.out.println("Khong tim thay sach cua tac gia " + author);
            }
        }
    }

    public void removeBookById(int bookId) {
        boolean removed = books.removeIf(b -> b.getBookId() == bookId);
        if (removed){
            System.out.println("Da xoa sach co ID: " + bookId);
        }
        else {
            System.out.println("Khong tim thay sach co ID: " + bookId);
        }
    }
}
