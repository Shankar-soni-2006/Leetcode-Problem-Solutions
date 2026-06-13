class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0, minProfit = prices[0];
        for(int i = 0; i < n; i++){
            maxProfit = Math.max(maxProfit, prices[i] - minProfit);
            minProfit = Math.min(minProfit, prices[i]);
        }
        return maxProfit;
    }
}