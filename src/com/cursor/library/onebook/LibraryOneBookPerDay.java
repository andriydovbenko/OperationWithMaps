package com.cursor.library.onebook;

import com.cursor.library.inputs.InputChoiceProcessing;
import com.cursor.library.manybook.LibraryManyBookPerDay;
import com.cursor.library.onebook.report.ReportOneBookLibrary;

public class LibraryOneBookPerDay {
    private String nameLibraryVisitor;
    private ReportOneBookLibrary reportOneBookLibrary;
    private boolean execution = true;

    public LibraryOneBookPerDay(String name) {
        this.reportOneBookLibrary = new ReportOneBookLibrary(name);
        this.nameLibraryVisitor = name;
        executeAction();
    }

    public void executeAction() {
        System.out.println("Here we are. Library where you can choose only one book per day");
        while (execution) {
            System.out.println("\nNow choose the action which you want to occur:\n" +
                    "1 - to print your library report\n" +
                    "2 - to find book's title by Date\n" +
                    "3 - to switch library\n" +
                    "4 - to exit from library\n");
            int choice = InputChoiceProcessing.startToSelectAction();
            if (choice == 1) {
                reportOneBookLibrary.printReport();
            } else if (choice == 2) {
                reportOneBookLibrary.findBookTakenByDate(InputChoiceProcessing.startToSelectDate());
            } else if (choice == 3) {
                new LibraryManyBookPerDay(nameLibraryVisitor);
            } else if (choice == 4) {
                System.out.println("The End");
                System.exit(0);
            } else {
                System.out.println("Incorrect choice");
            }
        }
    }
}