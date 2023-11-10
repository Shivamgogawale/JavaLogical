package examples;

public class Q23BuyAndSellStock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[] prices = {1, 3, 5, 7, 9};
	    int maxProfit = maxProfit(n, prices);
	    System.out.println("Maximum Profit: " + maxProfit);
	}
	public static int maxProfit(int n, int[] prices) {
	    int maxProfit = 0;
	    
	    for (int i = 0; i < n-1; i++) {
	        if (prices[i] < prices[i + 1]) {
	            maxProfit += prices[i + 1]- prices[i];
	        }
	    }
	    
	    return maxProfit;
	}

}
