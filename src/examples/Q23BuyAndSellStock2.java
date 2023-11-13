package examples;

public class Q23BuyAndSellStock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[] prices = {3, 4, 1, 5};
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
