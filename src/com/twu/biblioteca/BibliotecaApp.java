package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {
    private static ArrayList<Book> bookList = new ArrayList<Book>();
    private static ArrayList<String> mainMenuEntries = new ArrayList<String>();

    public BibliotecaApp(){
        bookList.clear();
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

    public static void initMainMenuEntries() {
        mainMenuEntries.clear();
        mainMenuEntries.add("List Books");
    }

    public void addMainEntries(){
        mainMenuEntries.add("Checkout Book");
    }

    public static void setMainMenuEntries(ArrayList<String> mainMenuEntries) {
        BibliotecaApp.mainMenuEntries = mainMenuEntries;
    }

    public String showMainMenu() {
        initMainMenuEntries();
        String result = "Main Menu:\n";
        for (int i = 0; i < mainMenuEntries.size(); i++) {
            result += Integer.toString(i+1) + "." + mainMenuEntries.get(i) + "\n";
        }
        return result;
    }

    public String showMainMenuWithQuit() {
        initMainMenuEntries();
        String result = "Main Menu:\n";
        for (int i = 0; i < mainMenuEntries.size(); i++) {
            result += Integer.toString(i+1) + "." + mainMenuEntries.get(i) + "\n";
        }
        result += "0.Quit\n";
        return result;
    }

    public ArrayList<String> getMainMenuEntries() {
        return mainMenuEntries;
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }
}
