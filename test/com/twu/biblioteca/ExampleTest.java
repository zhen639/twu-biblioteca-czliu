package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

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





}
