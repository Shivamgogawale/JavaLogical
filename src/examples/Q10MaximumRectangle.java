package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class Q10MaximumRectangle {

	public static void main(String[] args) {
		
		int[][] rect= {{1,2}, {3,4},{5,6},{40,5}};
		System.out.println(getMaxRect(rect));
		
	}
	public static int getMaxRect(int number[][])
	{
		HashMap<String, Integer> hashMap=new HashMap<>();
		for(int i=0;i<number.length;i++)
		{
			hashMap.put("reactangle "+i,getReactanglearea(number[i][0],number[i][1]));
		}
		Optional<Entry<String, Integer>> max = hashMap.entrySet().stream().max(Map.Entry.comparingByValue());
		Entry<String,Integer> maxvalue=max.get();
		return maxvalue.getValue();
	}
	
	
	
	public static int getReactanglearea(int length,int bredth)
	{
		return length*bredth;
	}

}
