package BTVN_BUOI_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true){
            System.out.println("MENU");
            System.out.println("1. Them sach vao thu vien");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ten tac gia");
            System.out.println("4. Xoa sach theo ma sach");
            System.out.println("5. Thoat chuong trinh");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Chon: ");
                continue;
            }

            switch (choice){

                case 1 -> {
                    System.out.println("So luong sach them: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++){
                        System.out.println("Nhap thong tin cuon sach thu " + (i+1) + " :");
                        System.out.println("Ten sach: ");
                        String title = sc.nextLine();
                        System.out.println("Tac gia: ");
                        String author = sc.nextLine();
                        System.out.println("Gia: ");
                        double price = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Co nhap nha xuat ban khong? (yes/no): ");
                        String ans = sc.nextLine();

                        Book book;
                        if (ans.equalsIgnoreCase("yes")){
                            System.out.println("Ten NXB; ");
                            String name = sc.nextLine();
                            System.out.println("Dia chi: ");
                            String address = sc.nextLine();
                            Publisher publisher = new Publisher(name, address);
                            book = new Book(title, author, price, publisher);
                        }
                        else {
                            book = new Book(title, author, price);
                        }
                        library.addBook(book);
                    }
                }

                case 2 -> {
                    System.out.println("Hien thi nha xuat ban khong? (yes/no): ");
                    boolean showPublisher = sc.nextLine().equalsIgnoreCase("yes");
                    library.displayAllBooks(showPublisher);
                }

                case 3 -> {
                    System.out.println("ten tac gia can tim: ");
                    String author = sc.nextLine();
                    library.searchByAuthor(author);
                }

                case 4 -> {
                    System.out.println("Ma sach can xoa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    library.removeBookById(id);
                }

                case 5 -> {
                    System.out.println("Da thoat chuong trinh.");
                    sc.close();
                    return;
                }

                default -> System.out.println("Sai cu phap.");
            }
        }
    }
}
