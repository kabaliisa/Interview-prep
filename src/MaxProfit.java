public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for(int i =0; i < prices.length; i++){
            buy = Math.min(prices[i], buy);
            maxProfit= Math.max(maxProfit, prices[i]-buy);
        }

        return maxProfit;




    }
}
