package lang.immutable.test;

import lang.immutable.change.ImmutableObj;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }


    public int getDay() {
        return day;
    }

    public ImmutableMyDate SetMonth(int month){
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate SetDay(int day){
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate SetYear(int year){
        return new ImmutableMyDate(year, month, day);
    }


    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }


}
