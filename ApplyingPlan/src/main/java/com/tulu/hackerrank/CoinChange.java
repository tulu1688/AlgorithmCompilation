package com.tulu.hackerrank;

import java.util.Scanner;

public class CoinChange {
    private static long makeChanges(int[] coins, int money, int index) {
        if (money == 0)
            return 1;
        if (index >= coins.length)
            index = 0;

        int amountWithCoin = 0;
        int ways = 0;
        while (amountWithCoin <= money) {
            int remain = money - coins[index];
            if (makeChanges(coins, remain, index + 1) > 0)
                amountWithCoin += coins[index];
            index++;
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] coins = new int[m];
        for (int coins_i = 0; coins_i < m; coins_i++) {
            coins[coins_i] = in.nextInt();
        }

        long ways = makeChanges(coins, n, 1);
        System.out.println(ways);
    }
}
