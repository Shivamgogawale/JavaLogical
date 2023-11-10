package examples;

import java.util.ArrayList;
import java.util.List;

public class Q22StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {100,180,260,310,40,535,695};
		stockBuySell(number);
	}
	public static List<ArrayList<Integer>> stockBuySell(int number[])

	{
		List <ArrayList<Integer>> ans=new ArrayList<>();
		int buy=0;
		int sell=0;
		for(int i=0;i<number.length-1;i++)
		{
			if(number[i+1]>number[i])
			{
				sell++;
			}
			 else {
	                if(sell>buy) {
	                    ArrayList<Integer> li = new ArrayList<>();
	                    li.add(buy);
	                    li.add(sell);
	                    ans.add(li);
	                }
	                buy = i+1;
	                sell = i+1;
	            }
	        }
	        if(sell>buy) {
	            ArrayList<Integer> li = new ArrayList<>();
	            li.add(buy);
	            li.add(sell);
	            ans.add(li);
	        }    
	        System.out.println(ans);
	        return ans;
	}
}	
	

