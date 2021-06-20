//Best Time to Buy and Sell Stock
/*
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Note that you cannot sell a stock before you buy one.

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
*/
package ds99.interview.allLevel;

public class Arrays17 {

    static int sellStock(int[] prices){
        int minStockPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            minStockPrice = Math.min(minStockPrice, prices[i]);
            maxProfit = Math.max(prices[i]-minStockPrice, maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(sellStock(arr));
    }
}

/*Solution:
At any time profit = sell price - buy price
we have to maintain minStockPrice which will have minimum price on which we could/can buy a stock then using this value
calculate maxProfit each day and find max out of it.
* */