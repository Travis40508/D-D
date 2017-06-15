package com.company;

public class Main {

    public static void main(String[] args) {
        /** Starting the app in a custom class to break out of static context. */
        Home home = new Home();
        home.init();
    }
}
