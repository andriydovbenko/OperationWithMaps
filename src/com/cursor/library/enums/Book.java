package com.cursor.library.enums;

public enum Book {
    GRISHAM("I Will Fear No Evil"),
    KEENAN("The Glory and the Dream"),
    ALDOUS("The Golden Bowl"),
    ALASTAR("Fear and Trembling"),
    COWARD("The Grapes of Wrath"),
    MICHAEL("A Handful of Dust"),
    JAMES("The Heart Is a Lonely Hunter"),
    FAULKNER("His Dark Materials"),
    ELLROY("I Sing the Body Electric"),
    COLIN("Carrion Comfort"),
    BROWN("Cabbages and Kings"),
    SAGAN("Butter In a Lordly Dish"),
    HENRY("Bonjour Tristesse"),
    SIMMONS("Blithe Spirit"),
    PARKER("A Time to Kill");

    private String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}