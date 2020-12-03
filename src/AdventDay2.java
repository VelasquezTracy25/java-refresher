// You've depostied a specific amount of dollars into your bank account. Each yrar your balance increased at the same growth rate. Find out how long it will take to pass a specific threshold with the assumption that you don't take any additional deposits.

public class AdventDay2 {

    double deposit;
    double rate;
    double threshold;

    public static void main(String[] args) {

        System.out.println(depositProfit(100, .20, 170));

    }

    public static double depositProfit(double deposit, double rate, double threshold) {

        double totalAccrued = deposit;
        double years = 0;
        double yearlyIncrease = deposit * rate;

        while (totalAccrued < threshold) {
            totalAccrued += yearlyIncrease;
            years++;
            System.out.println(deposit);
        }
        return years;
    }


}
