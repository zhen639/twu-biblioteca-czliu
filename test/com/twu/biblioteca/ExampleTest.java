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
}
