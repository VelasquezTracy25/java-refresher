//n children have got m pieces of candy. They want to eat as much candy as they can, but each child must eat exactly the same amount of candy as any other child. Determine how many pieces of candy will be eaten by all the children together.

public class AdventDay1 {

    public static void main(String[] args) {
        System.out.println(totalCandies(3,10));
        System.out.println(totalCandies(3,12));
        System.out.println(totalCandies(3,4));
    }

    public static double totalCandies(double n, double m){
    double candiesEach = Math.floor(m/n);
    return candiesEach * n;
    }
}
