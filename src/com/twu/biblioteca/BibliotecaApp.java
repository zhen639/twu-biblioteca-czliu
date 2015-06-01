package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {
    private static ArrayList<String> bookList = new ArrayList<String>();

    public static void main(String[] args) {

        System.out.println("Hello, world! !Myfriend");
    }

    public static String login() {
        return "Welcome to The Bangalore Public Library";
    }

    public static void generateBookList(){
        bookList.add("Dataming");
        bookList.add("How to be a good man");
    }

    public static String showBookList() {
        String result = "The book list:\n";
        generateBookList();
        for (int i = 0; i < bookList.size(); i++) {
            result += Integer.toString(i+1) + "." + bookList.get(i) + "\n";
        }
        return result;
    }
}
