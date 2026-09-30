class Solution {
    public int maxProfit(int[] prices) {
        int l=0, rez=0;
        for(int i = 0; i<prices.length; i++)
        {
            if(prices[l]>prices[i])
                l=i;
            rez=Math.max(rez,prices[i]-prices[l]);
        }
        return rez;
    }
}
