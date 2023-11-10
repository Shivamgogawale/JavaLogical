package src.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q9UniqueSubsetsWithOnlyEvenIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4, 2, 1, 9, 2, 6, 5, 3};
		System.out.println(uniqueEvenSubsets(a));

	}
	public static int uniqueEvenSubsets(int numbers[])
	{
		
		List<List<Integer>> powerset=new ArrayList<>();
		powerset.add(new ArrayList<>());
		for (int num : getEvenSubset(numbers)) {
				int length = powerset.size();
				for (int i = 0; i < length; i++) {
					List<Integer> temp = new ArrayList<>(powerset.get(i));
					temp.add(num);
					powerset.add(temp);
				}
		}
		return powerset.size()-1;
	}

	public static int[] getEvenSubset(int numbers[])
	{
		return Arrays.stream(numbers).filter(number -> number %2 ==0).distinct().toArray();
		
	}
 }
