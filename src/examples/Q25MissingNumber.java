package examples;

import java.util.Arrays;

public class Q25MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number= {1,2,3,4,5,7,8};
		System.out.println(missingNumber(number));
	}

	public static int missingNumber(int number[])
	{
		Arrays.sort(number);
		int cnt=number[0];
		for(int i=0;i<number.length;i++)
		{
			if(number[i] !=cnt)
				return cnt;
			cnt++;
		}
		return cnt;
	}
}
