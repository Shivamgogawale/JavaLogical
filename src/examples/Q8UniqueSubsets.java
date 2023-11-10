package src.examples;

import java.util.ArrayList;
import java.util.List;

public class Q8UniqueSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3};
		System.out.println(uniqueSubset(a)+"\nlength -->"+uniqueSubset(a).size());
	}
	
	public static List<List<Integer>> uniqueSubset(int numbers[])
	{
		List <List<Integer>> powerSet=new ArrayList<>();
		powerSet.add(new ArrayList<>());
		for(int number:numbers)
		{
			int n=powerSet.size();
			for(int i=0;i<n;i++)
			{
			List <Integer>temp=new ArrayList<Integer>(powerSet.get(i));
			temp.add(number);
			powerSet.add(temp);
			}
		}
		return powerSet;
		
	}

}
