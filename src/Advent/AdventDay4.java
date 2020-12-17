package Advent;//Given a year, return the century its in.

public class AdventDay4 {

    public static void main(String[] args) {
    returnCentury(100);
    returnCentury(0);
    returnCentury(1905);
    returnCentury(1700);
    }

    public static void returnCentury(int year) {
        if (year <= 0)
            System.out.print("0 or negative is not allowed");
        else if (year <= 100)
            System.out.print("1st century\n");
        else if (year % 100 == 0)
            System.out.print(year / 100 + " century");
        else
            System.out.print(year / 100 + 1 + " century");
    }
}

