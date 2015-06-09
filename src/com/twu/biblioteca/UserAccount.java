package com.twu.biblioteca;

/**
 * Created by liu on 6/9/15.
 */
public class UserAccount {
    private static String userName;
    private static String password;

    public static void setPassword(String password) {
        UserAccount.password = password;
    }

    public static void setUserName(String userName) {
        UserAccount.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUserName() {
        return userName;
    }
}
