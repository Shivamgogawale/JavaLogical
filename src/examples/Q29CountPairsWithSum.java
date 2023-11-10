package src.examples;

public class Q29CountPairsWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {1,5,7,1};
		getPairsCount(number,6);
	}
	
	public static int getPairsCount(int number[],int k)
	{
		int cnt=0;
		for(int i=0;i<number.length;i++)
		{
				for(int j=i+1;j<number.length;j++)
				{
					if(number[i]+number[j]==k)
					{
						cnt++;
					}
				}
		}
		return cnt;
	}

}
