package examples;

import java.util.Arrays;

public class Q14SmallestAndSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5, 2, 4, 3, 5, 6};
		int res[]=smallestAnd2ndSmallest(a);
		for(int i=0;i<2;i++)
		{
			System.out.print(res[i]);
		}
	}
	
	public static int[] smallestAnd2ndSmallest(int number[])	//return String with resultArray[0] + "\t"+resultArray[1];
	{
		int resultArray[]= {-1,-1};
		if(number.length <=2)
			return resultArray;
		Arrays.sort(number);
		resultArray[0]=number[0];
		resultArray[1]=number[1];
		return resultArray;
	}

}
