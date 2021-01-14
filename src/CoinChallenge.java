//revisiting coin question
// with coins 3, 5, and 1, list the minimimum amount of coins needed to return change

import java.util.*;

public class CoinChallenge {
    public static void main(String[] args) {
        minCoins(43);

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

}
