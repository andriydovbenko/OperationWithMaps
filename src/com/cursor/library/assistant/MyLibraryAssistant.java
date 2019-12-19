package com.cursor.library.assistant;

import com.cursor.library.inputs.InputChoiceProcessing;
import com.cursor.library.manybook.LibraryManyBookPerDay;
import com.cursor.library.onebook.LibraryOneBookPerDay;

public class MyLibraryAssistant {
    private String nameLibraryVisitor;

    public void executeAssistant() {
        System.out.println("Hello, I will your personal assistant.\n" +
                "I'm just a piece of code but you can call Ted.");
        this.nameLibraryVisitor = InputChoiceProcessing.startToSelectName();
        System.out.println("Okay, " + nameLibraryVisitor + ".\n" +
                "Now we are going to a one library. Choose one of them:\n" +
                "1 - library where you can choose only one book per day or\n" +
                "2 - library where you can choose more book per one day");
        int libraryChoice = InputChoiceProcessing.startToSelectLibrary();
        if (libraryChoice == 1) {
            new LibraryOneBookPerDay(nameLibraryVisitor);
        } else {
            new LibraryManyBookPerDay(nameLibraryVisitor);
        }
    }
}