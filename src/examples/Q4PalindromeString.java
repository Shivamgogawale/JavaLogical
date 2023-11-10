package src.examples;

public class Q4PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindromeString("madam"));
		
	}

	public static boolean isPalindromeString(String str)
	{
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i) != str.charAt(str.length() -1 -i))
				return false;
		}
		
		return true;
	}
}
