import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Book #" + i + " data:");
            System.out.print("Title: ");
            sc.nextLine(); // clear buffer
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Year: ");
            int year = sc.nextInt();
            books.add(new Book(title, author, year));
        }

        String path = "out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Book b : books) {

                bw.write(b.getTitle() + "," + b.getAuthor() + "," + b.getYear());
                bw.newLine();
            }
            System.out.println("\nFile saved successfully at: " + path);
        }
        catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        System.out.println("\nBooks published after 2000:");
        for (Book b : books) {
            if (b.getYear() > 2000) {
                System.out.println(b.getTitle() + " - " + b.getAuthor() + " (" + b.getYear() + ")");
            }
        }

        sc.close();
    }
}
