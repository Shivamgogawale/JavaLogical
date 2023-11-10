package src.examples;

import java.util.Arrays;

public class Q28SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int []number= {12,35,1,10,34,1,35};
		System.out.println(secondLargest(number));

	}
	public static int secondLargest(int [] number)
	{
		
		int[] array = Arrays.stream(number).distinct().sorted().toArray();
		return array[array.length-2];
	}
}
