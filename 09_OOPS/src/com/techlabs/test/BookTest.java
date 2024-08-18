package com.techlabs.test;

import com.techlabs.model.Book;

import java.util.Arrays;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter Book Id: ");
            int bookId = scanner.nextInt();

            System.out.print("Enter Book Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Author Name: ");
            String author = scanner.nextLine();

            System.out.print("Enter Book Price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter Publication: ");
            String publication = scanner.nextLine();

            books[i] = new Book(bookId, name, author, price, publication);
        }
        
        Arrays.sort(books, (b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice()));

        System.out.println("Books sorted in descending order of price:-  ");
        for (Book book : books) {
            System.out.println("Book Id: " + book.getBookId());
            System.out.println("Book Name: " + book.getName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Publication: " + book.getPublication());
        }
    }
}
