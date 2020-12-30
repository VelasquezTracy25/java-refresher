package Exercises;

public class OneThroughFive {
    public static void main(String[] args) {
        System.out.println(fibonnaci(5));
        System.out.println(fibonnaci(3));
        System.out.println(isPrimeNumber(5));
    }

    public static boolean isPrimeNumber(int number) {
        if (number % 1 == 0) {
            return true;
        }
        return false;
    }

    public static long fibonnaci(int i){
    if (i == 0) return 0;
    if (i <= 2) return 1;

    long fibTerm = fibonnaci(i-1) + fibonnaci(i-2);
    return fibTerm;
    }

}
