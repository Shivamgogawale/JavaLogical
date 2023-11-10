package examples;

import java.util.HashMap;
import java.util.Map;

public class Q15AnagramofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "bcaadeh";
		String S2 = "hea";
		System.out.println(anagramString(S1, S2));
	}
	public static int anagramString(String str1,String str2)
	{
		Map<Character,Integer> str1Hashmap=new HashMap<>();
		Map<Character,Integer> str2Hashmap=new HashMap<>();
		int deletedchar=0;
		for(char c:str1.toCharArray())
		{
			str1Hashmap.put(c,str1Hashmap.getOrDefault(c,0)+1);
		}
		for(char c:str2.toCharArray())
		{
			str2Hashmap.put(c,str2Hashmap.getOrDefault(c,0)+1);
		}
		
		for(char c:str1Hashmap.keySet())
		{
			 int cnt1=str1Hashmap.get(c);
			int cnt2=str2Hashmap.getOrDefault(c, 0);
			deletedchar=Math.abs(cnt1-cnt2)+deletedchar;
		}
		for (char c : str2Hashmap.keySet()) {
		    if (!str1Hashmap.containsKey(c)) {
		    	deletedchar += str2Hashmap.get(c);
		    }
		}
		return deletedchar;
	
	}
}
	