/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

  */

  // // Time Complexity: O(n) – One pass through the array to track lowest price and max profit.

public class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowest = prices[0];

        for (int p = 1; p < prices.length; p++) {
            if (lowest > prices[p]) {
                lowest = prices[p];
            } 
            if (prices[p] > lowest) {
                max = Math.max(max, prices[p] - lowest);
            }
        }
        return max;
    }
}