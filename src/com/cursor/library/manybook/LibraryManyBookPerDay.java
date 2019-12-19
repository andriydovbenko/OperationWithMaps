package com.cursor.library.manybook;

import com.cursor.library.inputs.InputChoiceProcessing;
import com.cursor.library.manybook.report.ReportManyBooks;
import com.cursor.library.onebook.LibraryOneBookPerDay;

public class LibraryManyBookPerDay {
    private String nameLibraryVisitor;
    private ReportManyBooks reportMany;
    private boolean execution = true;

    public LibraryManyBookPerDay(String name) {
        this.reportMany = new ReportManyBooks(name);
        this.nameLibraryVisitor = name;
        executeAction();
    }

    public void executeAction() {
        System.out.println("Here we are. Library where you can choose many books per day");
        while (execution) {
            System.out.println("\nNow choose the action which you want to occur:\n" +
                    "1 - to print your library report\n" +
                    "2 - to find book's title by Date\n" +
                    "3 - to switch library\n" +
                    "4 - to exit from library\n");
            int choice = InputChoiceProcessing.startToSelectAction();
            if (choice == 1) {
                reportMany.printReport();
            } else if (choice == 2) {
                reportMany.findBookTakenByDate(InputChoiceProcessing.startToSelectDate());
            } else if (choice == 3) {
                new LibraryOneBookPerDay(nameLibraryVisitor);
            } else {
                System.out.println("Incorrect choice");
            }
        }
    }
}

