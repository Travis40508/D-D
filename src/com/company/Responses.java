package com.company;

import java.util.Scanner;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class Responses {
    private Scanner scanner;
    private AppLogic appLogic;

    public Responses() {
        appLogic = new AppLogic();
        scanner = new Scanner(System.in);
    }

    /**
     * Retrieves username.
     */
    public String getUserName() {
        String name = scanner.next();
        return name;
    }
}
