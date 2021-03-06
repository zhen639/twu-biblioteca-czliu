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
        Book bookReturned = new Book();
        bookReturned.setName("Dataming");
        assertTrue(BibliotecaApp.returnBook(bookReturned));

    }

    @Test
    public void SuccessfulReturn(){
        ArrayList<String> mainMenuEntries = new ArrayList<String>();
        mainMenuEntries.add("List Book");
        mainMenuEntries.add("Checkout Book");
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ReturnBookController returnBookController = new ReturnBookController();
        Book bookReturned = new Book();
        bookReturned.setName("Dataming");
        returnBookController.setBookReturned(bookReturned);
        assertEquals("Thank you for returning the book.", returnBookController.returnBook());
    }

    @Test
    public void UnsuccessfulReturn(){
        ArrayList<String> mainMenuEntries = new ArrayList<String>();
        mainMenuEntries.add("List Book");
        mainMenuEntries.add("Checkout Book");
        ReturnBookController returnBookController = new ReturnBookController();
        Book bookReturned = new Book();
        bookReturned.setName("Go to your Daddy");
        returnBookController.setBookReturned(bookReturned);
        assertEquals("That is not a valid book to return.", returnBookController.returnBook());
    }

    @Test
    public void ListMovies(){
        MoviesViewer moviesViewer = new MoviesViewer();
        Movie upTheAir = new Movie();
        upTheAir.setName("Up the air");
        upTheAir.setYear("2009");
        upTheAir.setDirector("Jason Reitman");
        upTheAir.setRating("7.9");
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(upTheAir);

        moviesViewer.setMoviesList(movieList);
        assertEquals("1. Up the air, 2009, Jason Reitman, 7.9\n", moviesViewer.show());

    }

    @Test
    public void CheckoutMovie(){
        MovieController movieController = new MovieController();
        Movie upTheAir = new Movie();
        upTheAir.setName("Up the air");
        upTheAir.setYear("2009");
        upTheAir.setDirector("Jason Reitman");
        upTheAir.setRating("7.9");
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(upTheAir);
        assertEquals("You checkout Up the air\n", movieController.checkout(0));
    }

    @Test
    public void UserAccountsLogin(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        assertTrue(bibliotecaApp.checkLogin("admin", "admin"));
    }

    @Test
    public void UserAccountsInformation(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName("admin");
        userAccount.setPassword("admin");
        userAccount.setName("Caizhen Liu");
        userAccount.setEmail("zhen6939@163.com");
        userAccount.setPhoneNumber("177 7777 7777");
        bibliotecaApp.setUserAccount(userAccount);
        assertEquals("Caizhen Liu\n" +
                "zhen6939@163.com\n" +
                "177 7777 7777\n", bibliotecaApp.userInfo());
    }
}
