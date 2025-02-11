package algorithm.day11;

public class leetcode121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // 记录当前最低价格
        int maxProfit = 0; // 记录当前最大利润

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // 更新最低价格
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // 更新最大利润
            }
        }

        return maxProfit;
    }
}