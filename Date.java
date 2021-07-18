package com.company;

public class Date {
    private int Day;
    private int Month;
    private int Year;

    Date()
    {
        Day=0;
        Month=0;
        Year=0;
    }
    Date(int Day,int Month,int Year)
    {
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getDay() {
        return Day;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getMonth() {
        return Month;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getYear() {
        return Year;
    }
}
