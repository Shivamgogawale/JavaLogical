package examples;

import java.util.ArrayList;
import java.util.List;

public class Q18FirstandLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,3,5};
		System.out.println(firstAndLast(a, 3));
	}
	
	public static List<Integer> firstAndLast(int number[],int x)
	{
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==x)
			{
				list.add(i);
			}
		}
		return list;
	}
}
