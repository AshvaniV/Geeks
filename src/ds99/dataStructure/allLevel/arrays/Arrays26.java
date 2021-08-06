/* **Hard** Maximum profit by buying and selling a share at most twice.
In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to
make at most 2 transactions in a day, whereas the second transaction can only start after the first one is complete
(Sell->buy->sell->buy). Given stock prices throughout the day, find out the maximum profit that a share trader could have made. */

package ds99.dataStructure.allLevel.arrays;

public class Arrays26 {

    private static int maxProfit(int[] price, int n) {
        int buy1 = Integer.MAX_VALUE;
        int buy2 = Integer.MAX_VALUE;
        int profit1 = 0;
        int profit2 = 0;

        for (int i = 0; i < n; i++) {
            buy1 = Math.min(buy1, price[i]);

            profit1 = Math.max(profit1, price[i] - buy1);

            buy2 = Math.min(buy2, price[i] - profit1);

            profit2 = Math.max(profit2, price[i] - buy2);
        }
        return profit2;
    }

    public static void main(String[] args) {
        int[] price = {1, 2, 3, 1, 6, 7};
        System.out.println(maxProfit(price, price.length));
    }
}

/*Logic:
* buy1 is responsible to buy 1st stock at minimum price.
* profit1 is responsible to sell 1st stock in make max profit for first stock.
* Now we know how much we have made from 1st stock so we can spend some money out of profit1 [so we will have left
  some money after spending to buy buy2, so buy2 will go into negative that means we have this much extra money]
* buy2 is having all the amount which we had after selling 1st stock and bought another so this value is helpful to
  calculate profit2 [as this value might have negative number depends on how much we have extra after selling first stock
  so {price[i] - buy2}, will give a positive number which will be overall profit for us]
* If we think about corner case that we can't buy ans sell stock on same day but here we don't have any such restriction
  because this corner case don't have any issue as if we bought and sell stock on same day it will calculate profit as 0;
*/