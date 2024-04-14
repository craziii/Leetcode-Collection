// Based on Kadane's algorithm

class Solution {
    public int maxProfit(int[] prices) {
        int buyValue = prices[0];
        int difference = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyValue){
                buyValue = prices[i];
            }
            else if(prices[i] - buyValue > difference){
                difference = prices[i] - buyValue;
            }
        }
        return difference;
    }
}