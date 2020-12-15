// You've deposited a specific amount of dollars into your bank account. Each year your balance increased at the same growth rate. Find out how long it will take to pass a specific threshold with the assumption that you don't take any additional deposits.

public class AdventDay2 {
    public static void main(String[] args) {
        System.out.println(depositProfit(100, .20, 170));
        //100 - 120
        //120 - 144
        //144 - 172.8
        System.out.println(depositProfit(10, .20, 170));

    }

    public static double depositProfit(double deposit, double rate, double threshold) {

        double totalAccrued = deposit;
        double years = 0;

        while (totalAccrued < threshold) {
            double yearlyIncrease = totalAccrued * rate; //20
            totalAccrued = totalAccrued + yearlyIncrease;
            years++;
            System.out.println(totalAccrued + " " + years);
        }
        return years;
    }


}
