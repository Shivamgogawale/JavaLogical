package examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q21UniqueNumberOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int[] number= {1,1,3,5,5};
		System.out.println(isFrequencyUnique(number));
	}
	
	public static boolean isFrequencyUnique(int number[])
	{
		Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
		for(int num:number)
		{
			hashMap.put(num,hashMap.getOrDefault(num,0)+1);
		}
		HashSet<Integer> set=new HashSet<>();
		for(int element:hashMap.values())
		{
			if(set.contains(element))
				return false;
			else
				set.add(element);
		}
		return true;
	}

}
