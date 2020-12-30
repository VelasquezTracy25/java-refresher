package Exercises;

public class OneThroughFive {
    public static void main(String[] args) {

        System.out.println(isAPrimeNumber(5));
    }

    public static boolean isAPrimeNumber(int number) {
        if (number % 1 == 0) {
            return true;
        }
        return false;
    }

}
