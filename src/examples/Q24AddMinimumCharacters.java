package src.examples;

public class Q24AddMinimumCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addMinChar("Mada"));
	}
	public static int addMinChar(String str)
	{
		if(isPalindrome(str))
			return 0;
		StringBuilder sb=new StringBuilder(str);
		sb=sb.reverse();
		int cnt=0;
		for(int i=0;i<sb.length()-1;i++)
		{
			
			str=String.valueOf(sb.charAt(sb.length()-2-i))+str;
			cnt++;
			if(isPalindrome(str) == Boolean.TRUE)
				break;
		}
		return cnt;
	}
	
	public static boolean isPalindrome(String str)
	{
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i) != str.charAt(str.length() -1 -i))
				return false;
		}
		return true;
	}
}
