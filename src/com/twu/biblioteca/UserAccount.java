package com.twu.biblioteca;

/**
 * Created by liu on 6/9/15.
 */
public class UserAccount {
    private static String userName;
    private static String password;
    private static String name;
    private static String email;
    private static String phoneNumber;

    public static void setName(String name) {
        UserAccount.name = name;
    }

    public static void setEmail(String email) {
        UserAccount.email = email;
    }

    public static void setPhoneNumber(String phoneNumber) {
        UserAccount.phoneNumber = phoneNumber;
    }

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

    public static String getName() {
        return name;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }
}
