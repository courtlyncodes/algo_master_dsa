/* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

  */

  // // Time Complexity: O(n) – One pass through the array to track lowest price and max profit.

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var lowest = prices[p]

        for (p in 1 until prices.size) {
            if (lowest > prices[p]) {
                lowest = prices[p]
            }
            if (prices[p] > lowest) {
                max = maxOf(max, prices[p] - lowest)
            }
        }
        return max
    }
}