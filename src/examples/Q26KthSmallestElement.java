package examples;

import java.util.Arrays;

public class Q26KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []number= {7,10,4,3,20,15};
		System.out.println(KthSmallestElement(number, 5));
	}

	public static int KthSmallestElement(int number[], int k) {
		Arrays.sort(number);
		if (number.length < k)
			return -1;
		for (int i = 0; i < k; i++) {
			if (i == k-1)
				return number[i];
		}
		return -1;
	}
}
