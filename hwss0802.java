import java.util.Scanner;

public class hwss0802 {
    public static class Book {
        public String title;
        public String author;
        public double price;
        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String a =  sc.nextLine();
        System.out.print("Enter Book Author: ");
        String b = sc.nextLine();
        System.out.print("Enter Book Price: ");
        double c = Double.parseDouble(sc.nextLine());
        Book book = new Book(a, b, c);
        System.out.println("Title: " + book.title + ", Author: " + book.author + ", Price: " + book.price);
    }
}
