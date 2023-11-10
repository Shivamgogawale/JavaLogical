package examples;

import java.util.Scanner;

public class Q2Palindrome {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to find Palindrome");		
		//String convertForPalindrome=String.valueOf(sc.nextInt());
		Integer convertForPalindrome=sc.nextInt();
		if(isPalindrome(convertForPalindrome) == Boolean.TRUE)
			System.out.println("Number Is Palindrome");
		else
			System.out.println("Number is not palindrome");
		if(isPalindromeWithInteger(convertForPalindrome) == Boolean.TRUE)
			System.out.println("Number Is Palindrome");
		else
			System.out.println("Number is not palindrome");
	}
	
	public static boolean isPalindrome(int number)
	{
		String numberStr=String.valueOf(number);
		for(int i=0;i<=numberStr.length()/2;i++)
		{
		if(numberStr.charAt(i) != numberStr.charAt(numberStr.length()-1-i))
			return false;
		}
		return true;
	}
	
	
	  public static boolean isPalindromeWithInteger(int number) 
	  { 
			int temp = number;
			int rev = 0;
			while(temp !=0) {
				int digits=temp%10;
				rev=(rev*10)+digits;
				temp=temp/10;;
				
			}
			if(rev == number)
				return true;
			else
				return false;
		}
	 
}
