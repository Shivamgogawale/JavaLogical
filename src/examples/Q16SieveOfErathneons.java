package src.examples;

import java.util.Arrays;

public class Q16SieveOfErathneons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=sieveOfErathneons(50);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	
		public static int[] sieveOfErathneons(int n)
		{
			int[] isPrime=new int[n+1];
			int cnt=0,index=0;
			Arrays.fill(isPrime,1);
			isPrime[0]=isPrime[1]=0;
			for(int i=2;i<=n;i++)
			{
				if(isPrime[i]==1)
				{
					for(int j=2*i;j<=n;j=j+i)
					{
						isPrime[j]=0;
					}
					cnt++;
				}
			}
			int[] resultPrime=new int[cnt];			
			for(int i=0;i<=n;i++)
			{
				if(isPrime[i]==1)
				{
					resultPrime[index]=i;
					index++;
					
				}
			}
		return resultPrime;
	}

}
