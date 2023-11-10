package examples;

public class Q5NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("the "+n+"  fibonnaci number is"+ nthFibonnaci(n));
	}

		public static int nthFibonnaci(int number)
		{
			if(number <= 0)
				return 0;
			if(number ==1 )
				return 1;
			int fibonacciNum[]=new int[number+1];
			fibonacciNum[0]=0;
			fibonacciNum[1]=1;
			for(int i=2;i<=number;i++) {
				fibonacciNum[i]=(fibonacciNum[i-1]+ fibonacciNum[i-2]) % 1000000007;
			}
			return fibonacciNum[number];
		}
}
