package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by liu on 6/6/15.
 */
public class ReturnBookController {
    private static Book bookReturned;

    public static void setBookReturned(Book bookReturned) {
        ReturnBookController.bookReturned = bookReturned;
    }

    public static String returnBook(){
        ArrayList<Book> booksInLibrary = new ArrayList<Book>();
        booksInLibrary = BibliotecaApp.getBookList();
        for (int i = 0; i < booksInLibrary.size(); i++) {
            if (booksInLibrary.get(i).getName() == bookReturned.getName()) return "Thank you for returning the book.";
        }
        return "That is not a valid book to return.";
    }

}
