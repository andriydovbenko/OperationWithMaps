package com.cursor.library.inputs;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputChoiceProcessing {

    public static int startToSelectLibrary() {
        boolean condition = true;
        int libraryChoice = 0;
        do {
            Scanner inputChoice = new Scanner(System.in);
            try {
                libraryChoice = inputChoice.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input Error, try again");
            }
            if (libraryChoice == 1 || libraryChoice == 2) {
                condition = false;
            } else {
                System.out.println("Enter only 1 or 2");
            }
        } while (condition);
        return libraryChoice;
    }

    public static LocalDate startToSelectDate() {
        LocalDate date;
        do {
            Scanner inputDate = new Scanner(System.in);
            System.out.println("Enter the date. Date's format should be like: \"2019-11-11\"");
            String inputStringDate = inputDate.next();
            try {
                date = LocalDate.parse(inputStringDate);
            } catch (DateTimeParseException e) {
                System.out.println("Input Error. You have done a mistake when had written date.\n" +
                        "But I can correct you by assuming you have entered today's date");
                date = LocalDate.now();
            }
        } while (date == null);
        return date;
    }

    public static String startToSelectName() {
        String question = "What is your name?";
        String nameOfVisitor = "";
        while (nameOfVisitor.length() < 3) {
            System.out.println(question);
            Scanner inputName = new Scanner(System.in);
            nameOfVisitor = inputName.next();
            question = " Name should be longer.";
        }
        return nameOfVisitor;
    }

    public static int startToSelectAction() {
        int libraryChoice = 0;
        while (libraryChoice == 0) {
            Scanner inputChoice = new Scanner(System.in);
            try {
                libraryChoice = inputChoice.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input Error, try again");
            }
        }
        if (libraryChoice == 4) {
            System.out.println("The End");
            System.exit(0);
        }
        return libraryChoice;
    }
}