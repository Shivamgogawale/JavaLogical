package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18FirstandLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,3,3,5};
		Arrays.stream(firstAndLast(a, 3)).forEach(x->System.out.print(x+"\t"));
	}
	
	public static int[] firstAndLast(int number[],int x)
	{
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==x)
			{
				list.add(i);
			}
		}
		int result[]=new int[2];
		result[0]=list.get(0);
		result[1]=list.get(list.size()-1);
		return result;
	}
}
