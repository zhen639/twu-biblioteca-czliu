package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

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
                BibliotecaApp.showBookList());
    }

    @Test
    public void ListBooksDetails(){
        assertEquals("The book list:\n1.Dataming, Jack Chen, 2012\n2.How to be a good man, Jammo Tang, 2009\n",
                BibliotecaApp.showBookListDetails());
    }


}
