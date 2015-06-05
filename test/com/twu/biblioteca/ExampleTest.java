package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void WelcomMessage(){
        assertEquals("Welcome to The Bangalore Public Library", BibliotecaApp.login());
    }

    @Test
    public void ListBooks(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        assertEquals("The book list:\n1.Dataming\n2.How to be a good man\n",
                bibliotecaApp.showBookList());
    }

    @Test
    public void ListBooksDetails(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        assertEquals("The book list:\n1.Dataming, Jack Chen, 2012\n2.How to be a good man, Jammo Tang, 2009\n",
                BibliotecaApp.showBookListDetails());
    }

    @Test
    public void MainMenu(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        assertEquals("Main Menu:\n1.List Books\n", bibliotecaApp.showMainMenu());
    }

    @Test
    public void InvalidMenuOption(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        MainMenuController mainMenuController = new MainMenuController();
        mainMenuController.setMainMenuEntries(bibliotecaApp.getMainMenuEntries());
        assertEquals("Select a valid option!", mainMenuController.selectOption(4));
    }

    @Test
    public void QuitSystem(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        MainMenuController mainMenuController = new MainMenuController();
        mainMenuController.setMainMenuEntries(bibliotecaApp.getMainMenuEntries());
        assertEquals("You have quited the Library System", mainMenuController.selectOption(0));
    }

    @Test
    public void CheckoutBook(){
        ArrayList<String> mainMenuEntries = new ArrayList<String>();
        mainMenuEntries.add("List Book");
        mainMenuEntries.add("Checkout Book");
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        BibliotecaApp.setMainMenuEntries(mainMenuEntries);
        MainMenuController mainMenuController = new MainMenuController();
        mainMenuController.setMainMenuEntries(bibliotecaApp.getMainMenuEntries());
        assertEquals("Checkout book", mainMenuController.selectOption(2));

    }

    @Test
    public void SuccessfulCheckout(){
        ArrayList<String> mainMenuEntries = new ArrayList<String>();
        mainMenuEntries.add("List Book");
        mainMenuEntries.add("Checkout Book");
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ArrayList<Book> booklist = new ArrayList<Book>();
        booklist = bibliotecaApp.getBookList();
        BibliotecaApp.setMainMenuEntries(mainMenuEntries);
        MainMenuController mainMenuController = new MainMenuController();
        mainMenuController.setMainMenuEntries(bibliotecaApp.getMainMenuEntries());
        CheckoutBookController checkoutBookController = new CheckoutBookController();
        checkoutBookController.setBooklist(booklist);
        assertEquals("Thank you! Enjoy the book", checkoutBookController.checkoutBook(2));
    }

    @Test
    public void UnsuccessfulCheckout(){
        ArrayList<String> mainMenuEntries = new ArrayList<String>();
        mainMenuEntries.add("List Book");
        mainMenuEntries.add("Checkout Book");
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ArrayList<Book> booklist = new ArrayList<Book>();
        booklist = bibliotecaApp.getBookList();
        BibliotecaApp.setMainMenuEntries(mainMenuEntries);
        MainMenuController mainMenuController = new MainMenuController();
        mainMenuController.setMainMenuEntries(bibliotecaApp.getMainMenuEntries());
        CheckoutBookController checkoutBookController = new CheckoutBookController();
        checkoutBookController.setBooklist(booklist);
        assertEquals("That book is not available.", checkoutBookController.checkoutBook(5));
    }

    @Test
    public void ReturnBook(){
        ArrayList<String> mainMenuEntries = new ArrayList<String>();
        mainMenuEntries.add("List Book");
        mainMenuEntries.add("Checkout Book");
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ReturnBookController returnBookController = new ReturnBookController();
    }
}
