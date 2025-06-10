package Praktikum;

import java.util.Stack;
import Praktikum.Book.Book;

public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman Java");
        Book book2 = new Book("5678", "Pengantar Algoritma");
        Book book3 = new Book("9101", "Struktur Data dan Algoritma");
    
        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        System.out.println("Peek Books");
        Book temp = books.peek();
        if(temp != null){
            System.out.println(temp.toString());
        }

        System.out.println("\nPop Books");
        Book temp2 = books.pop();
        if(temp2 != null){
            System.out.println(temp2.toString());
        }

        System.out.println("\nSemua Books di Stack");
        for(Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nSearch Books");
        int found = books.search(book1);
        if(found != -1) {
            System.out.println("Buku ditemukan di indexs: " + found);
        } else {
            System.out.println("Buku tidak ditemukan");
        }
    }
}
