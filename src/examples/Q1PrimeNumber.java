package src.examples;

import java.util.Scanner;

public class Q1PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		if(primerNumber(no)==false)
			System.out.println(no+" is not prime");
		else
			System.out.println(no+" is Prime");
		
	}

	public static boolean primerNumber(int number) {
		
		if(number==2 || number==3)
				return true;
		if(number<=1)
			return false;
		if(number %2 ==0 )
			return false;
			
		for(int i=3;i<number;i+=2)
		{
			if(number%i==0) return false;
			
		}
		return true;
	}
}
