class Solution {
    public int maxProfit(int[] prices) {
        int Buy=prices[0];
        int Profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<Buy){
                Buy=prices[i];
                
            }
            Profit=Math.max(Profit,prices[i]-Buy);
        }
        return Profit;
    }
}
