package examples;

public class Q3Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getFactorial(5));
	}
	
	public static int getFactorial(int number)
	{
		int fact=1;
		while(number>0)
		{
			fact=fact*number;
			number--;
		}
		return fact;
	}
}
