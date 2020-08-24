
public class BestTimetoBuyandSellStockII {
	public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        for(int j = 1; j < prices.length; j++){
            if(prices[j] > prices[j-1]){
                maxProfit += prices[j] - prices[j-1];
            }
            
        }
        
        return maxProfit;
    }
	
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int profit = maxProfit(arr);
		System.out.print("Best Time to Buy and Sell Stock : " +profit);
	}
}
