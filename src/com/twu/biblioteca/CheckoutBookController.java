package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by liu on 6/6/15.
 */
public class CheckoutBookController {
    private static ArrayList<Book> booklist;

    public static void setBooklist(ArrayList<Book> booklist) {
        CheckoutBookController.booklist = booklist;
    }

    public static String checkoutBook(int i){
        if (i<0 || i>booklist.size()){
            return "That book is not available.";
        }else if (i==0){
            return "";
        }else{
            return "Thank you! Enjoy the book";
        }
    }
}
