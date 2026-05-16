class Solution {
    public int maxProfit(int[] prices) {
        int n=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int p:prices){
            if(n>p){
                n=p;
            }
            int profit=p-n;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
