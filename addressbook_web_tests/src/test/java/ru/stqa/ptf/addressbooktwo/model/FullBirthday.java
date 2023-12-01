package ru.stqa.ptf.addressbooktwo.model;

public class FullBirthday {
    private String day;
    private String month;
    private String year;

    public FullBirthday(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear(){
        return year;
    }
}
