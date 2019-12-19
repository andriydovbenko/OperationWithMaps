package com.cursor.library.manybook.report;

import com.cursor.library.enums.Book;

import java.time.LocalDate;
import java.util.*;

public class ReportManyBooks {
    private final String USER_NAME;
    private final int YEAR = 2019;
    private final int MONTH = 11;
    private Map<LocalDate, List<String>> libraryReport = new TreeMap<>();

    public ReportManyBooks(String name) {
        this.USER_NAME = name;
        createReport();
    }

    public void createReport() {
        libraryReport.put(LocalDate.of(YEAR, MONTH, 1),
                new ArrayList<>(Arrays.asList(Book.COLIN.getTitle(), Book.BROWN.getTitle())));
        libraryReport.put(LocalDate.of(YEAR, MONTH, 3),
                new ArrayList<>(Arrays.asList(Book.ALASTAR.getTitle(), Book.SAGAN.getTitle())));
        libraryReport.put(LocalDate.of(YEAR, MONTH, 6),
                new ArrayList<>(Arrays.asList(Book.SAGAN.getTitle(), Book.HENRY.getTitle())));
        libraryReport.put(LocalDate.of(YEAR, MONTH, 11),
                new ArrayList<>(Arrays.asList(Book.GRISHAM.getTitle(), Book.SIMMONS.getTitle())));
        libraryReport.put(LocalDate.of(YEAR, MONTH, 12),
                new ArrayList<>(Arrays.asList(Book.COLIN.getTitle(), Book.PARKER.getTitle(), Book.JAMES.getTitle())));
        libraryReport.put(LocalDate.of(YEAR, MONTH, 15),
                new ArrayList<>(Collections.singleton(Book.COWARD.getTitle())));
        libraryReport.put(LocalDate.of(YEAR, MONTH, 19),
                new ArrayList<>(Arrays.asList(Book.ELLROY.getTitle(), Book.BROWN.getTitle())));
        libraryReport.put(LocalDate.of(YEAR, MONTH, 22),
                new ArrayList<>(Collections.singletonList(Book.JAMES.getTitle())));
        libraryReport.put(LocalDate.of(YEAR, MONTH, 26),
                new ArrayList<>(Arrays.asList(Book.MICHAEL.getTitle(), Book.KEENAN.getTitle())));
    }

    public void printReport() {
        System.out.println("Report for: " + USER_NAME);
        for (Map.Entry<LocalDate, List<String>> entry : libraryReport.entrySet()) {
            System.out.println("Day: " + entry.getKey() + " quantity: " + entry.getValue().size());
        }
    }

    public void findBookTakenByDate(LocalDate specificDate) {
        List<String> titleOfABook = libraryReport.getOrDefault(specificDate,
                new ArrayList<>(Collections.singletonList(" you didn't take any books")));
        System.out.println("In " + specificDate + " " + titleOfABook);
    }
}