class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=101;
        

        for(int i:prices){
            if(i<min){
                min=i;
            }
            else{
                
                profit=Math.max(profit,i-min);
            }
        }
        return profit;
    }
}
