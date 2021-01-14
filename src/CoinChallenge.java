//revisiting coin question
// with coins 3, 5, and 1, list the minimum amount of coins needed to return change

import java.util.*;

public class CoinChallenge {
    public static void main(String[] args) {
        System.out.println(minCoins(11)); //should return 3 (5+5+1)
        System.out.println(minCoins(20)); // should return 4 (5x4)
        System.out.println(minCoins(1)); // should return 1 (1)
        System.out.println(minCoins(0)); // should return 0
    }

    public static int minCoins(int input) {
        int[] coins = {1, 3, 5};

// initialize total coins
        int totalCoins = 0;

        while (input != 0) {
            if (input - coins[0] >= 0) {
                totalCoins++;
                input = input - coins[0];
            } else if (input - coins[1] >= 0) {
                totalCoins++;
                input = input - coins[1];
            } else if (input - coins[2] >= 0) {
                totalCoins++;
                input = input - coins[2];
            }
        }
        return totalCoins;
    }

}
