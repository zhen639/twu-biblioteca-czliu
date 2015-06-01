package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {
    private static ArrayList<Book> bookList = new ArrayList<Book>();

    public BibliotecaApp(){
        Book book1 = new Book();
        book1.setName("Dataming");
        book1.setAuthor("Jack Chen");
        book1.setPublishYear("2012");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setName("How to be a good man");
        book2.setAuthor("Jammo Tang");
        book2.setPublishYear("2009");
        bookList.add(book2);
    }

    public static void main(String[] args) {

        System.out.println("Hello, world! !Myfriend");
    }

    public static String login() {
        return "Welcome to The Bangalore Public Library";
    }

    public static String showBookList() {
        String result = "The book list:\n";
        for (int i = 0; i < bookList.size(); i++) {
            result += Integer.toString(i+1) + "." + bookList.get(i).getName() + "\n";
        }
        return result;
    }

    public static String showBookListDetails() {
        String result = "The book list:\n";
        for (int i = 0; i < bookList.size(); i++) {
            result += Integer.toString(i+1) + "."
                    + bookList.get(i).getName()+ ", "
                    + bookList.get(i).getAuthor() + ", "
                    + bookList.get(i).getPublishYear() + "\n";
        }
        return result;
    }
}
