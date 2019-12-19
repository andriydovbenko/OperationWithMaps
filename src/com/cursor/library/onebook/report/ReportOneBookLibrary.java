package com.cursor.library.onebook.report;

import com.cursor.library.enums.Book;

import java.time.LocalDate;
import java.util.*;

public class ReportOneBookLibrary {
    private final String USER_NAME;
    private final int YEAR = 2019;
    private final int MONTH = 11;
    private Map<LocalDate, String> libraryReport = new TreeMap<>();

    public ReportOneBookLibrary(String name) {
        this.USER_NAME = name;
        createReport();
    }

    public void createReport() {
        libraryReport.put(LocalDate.of(YEAR, MONTH, 1), Book.GRISHAM.getTitle());
        libraryReport.put(LocalDate.of(YEAR, MONTH, 3), Book.KEENAN.getTitle());
        libraryReport.put(LocalDate.of(YEAR, MONTH, 6), Book.ALASTAR.getTitle());
        libraryReport.put(LocalDate.of(YEAR, MONTH, 11), Book.ALDOUS.getTitle());
        libraryReport.put(LocalDate.of(YEAR, MONTH, 12), Book.COWARD.getTitle());
        libraryReport.put(LocalDate.of(YEAR, MONTH, 15), Book.MICHAEL.getTitle());
        libraryReport.put(LocalDate.of(YEAR, MONTH, 19), Book.JAMES.getTitle());
        libraryReport.put(LocalDate.of(YEAR, MONTH, 22), Book.FAULKNER.getTitle());
        libraryReport.put(LocalDate.of(YEAR, MONTH, 26), Book.ELLROY.getTitle());
    }

    public void printReport() {
        System.out.println("Report for: " + USER_NAME);
        for (Map.Entry<LocalDate, String> entry : libraryReport.entrySet()) {
            System.out.println("Day " + entry.getKey() + " title: " + entry.getValue());
        }
    }

    public void findBookTakenByDate(LocalDate specificDate) {
        String titleOfABook = libraryReport.getOrDefault(specificDate, " you didn't take any books");
        System.out.println("In " + specificDate + " " + titleOfABook);
    }
}