package examples;

public class Q12ZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {4,3,7,8,6,2,1};
		zigZag(number);
	}

	public static int[] zigZag(int number[])
	{
		
		for(int i=0;i<number.length-1;i++)
		{
			if(i%2==0  && number[i+1]<number[i] )
			{
				int [] result= getSwap(number[i], number[i+1]);
				number[i]=result[0];
				number[i+1]=result[1];
			}
			else if(i%2 ==1 && number[i+1] >number[i])
			{
				int [] result= getSwap(number[i], number[i+1]);
				number[i]=result[0];
				number[i+1]=result[1];
			}
		}
		return number;
	}
	public static int[] getSwap(int number1,int number2)
	{
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		int result[]= {number1,number2};
		return result;
	}
	
	
}
