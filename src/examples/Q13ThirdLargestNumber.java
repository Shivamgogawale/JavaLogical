package examples;

import java.util.Arrays;

public class Q13ThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,1,3,5,9};
		getThirdLargestNumber(a);
	}

	public static int getThirdLargestNumber(int number[])
	{
		if(number.length<3)
			return 0;
		Arrays.sort(number);
		return number[number.length-3];
	}
}
