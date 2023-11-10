package examples;

public class Q11ImmediateSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5, 6, 2, 3, 1, 7};
		immdiateSmaller(a);
	}
	
	public static void immdiateSmaller(int []number)
	{
		int[] result=new int[number.length];
		result[number.length-1]=-1;
		for(int i=0;i<number.length-1;i++)
		{
			if(number[i]<number[i+1])
				result[i]=-1;
			else
				result[i]=number[i+1];
		}
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}
