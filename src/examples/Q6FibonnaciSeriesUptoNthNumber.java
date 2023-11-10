package src.examples;

import java.util.Arrays;

public class Q6FibonnaciSeriesUptoNthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		Arrays.stream(fibonacciSeriesUptoNth(n)).forEach(number -> System.out.print(number+"\t"));
	}
	
	public static int[] fibonacciSeriesUptoNth(int number)
	{
		if(number<=1) return new int [] {0,1};
		int [] fibonacciSeries=new int[number+1];
		fibonacciSeries[0]=0;
		fibonacciSeries[1]=1;
		for(int i=2;i<=number;i++)
		{
			fibonacciSeries[i]=fibonacciSeries[i-1] + fibonacciSeries[i-2];
		}
		return fibonacciSeries;
	}

}
