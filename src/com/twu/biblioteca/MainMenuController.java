package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by liu on 6/3/15.
 */
public class MainMenuController {
    private static ArrayList<String> mainMenuEntries = new ArrayList<String>();

    public void setMainMenuEntries(ArrayList<String> mainMenuEntries) {
        MainMenuController.mainMenuEntries = mainMenuEntries;
    }

    public String selectOption(int i){
        if (i<0 || i>mainMenuEntries.size()){
            return "Select a valid option!";
        }else if (i==0){
            return "You have quited the Library System";
        }else if (i==2){
            return "Checkout book";
        }
        return null;
    }

}