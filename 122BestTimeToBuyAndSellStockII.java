class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (diff > 0) {
                maxProfit += diff;
            }
        }
        return maxProfit;
    }
}