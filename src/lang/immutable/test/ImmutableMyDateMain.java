package lang.immutable.test;

import lang.immutable.change.ImmutableObj;

public class ImmutableMyDateMain {


    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1,1);
        ImmutableMyDate date2 =  date1;

        System.out.println("date1 ="+ date1);
        System.out.println("date2 ="+ date2);

        System.out.println("2025 -> date1"); //date1의 year만 2025변경
        date1 = date1.SetYear(2025);
        System.out.println("date1 ="+ date1);
        System.out.println("date2 ="+ date2);
    }
}
