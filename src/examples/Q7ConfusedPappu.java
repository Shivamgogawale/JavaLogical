package examples;

public class Q7ConfusedPappu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Maximum Possible extra amount is "+extraAmountGivenByPappu(35));
	}

	public static int extraAmountGivenByPappu(int number)
	{
		int temp=number;
		int sum=0;
		int pos=1;
		while(temp>0)
		{
			int digit=temp%10;
			if(digit == 6) 
				digit =digit+3;
			else if(digit == 9)
				digit=digit -3;
			temp=temp/10;
			 sum = sum +(digit * pos);
			 pos =pos * 10;			
		}
		if(sum>number) 
			return sum-number;
		else 
			return number-sum;
	}
}
