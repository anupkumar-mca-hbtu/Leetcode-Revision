class Solution {
    public int maxProfit(int[] prices) {
        int profit_day=0;
        int max_profit=0;
        for(int i=1;i<prices.length;i++) {
            if(prices[profit_day]>prices[i]) {
                profit_day=i;
            } else {
              max_profit= Math.max(max_profit, prices[i]-prices[profit_day]);
            }
        }
        return max_profit;
    }
}