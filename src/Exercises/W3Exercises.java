package Exercises;

public class W3Exercises {
    public static void main(String[] args) {
        areEqual(1, 1, 1, 1);
        areEqual(1, 2, 3, 4);
        compareNumbers(1,2);
        compareNumbers(1,1);
        compareNumbers(2,1);
            }

    //Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.

    public static void areEqual(int num1, int num2, int num3, int num4) {
        if (num1 == num2 && num3 == num4) {
            if (num2 == num3)
                System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }

    }

//Write a Java program to compare two numbers.

    public static void compareNumbers(int num1, int num2) {
        if (num1 == num2)
            System.out.printf("%d == %d\n", num1, num2);
        if (num1 != num2)
            System.out.printf("%d != %d\n", num1, num2);
        if (num1 < num2)
            System.out.printf("%d < %d\n", num1, num2);
        if (num1 > num2)
            System.out.printf("%d > %d\n", num1, num2);
        if (num1 <= num2)
            System.out.printf("%d <= %d\n", num1, num2);
        if (num1 >= num2)
            System.out.printf("%d >= %d\n", num1, num2);
    }
}
