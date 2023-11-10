package examples;

public class Q27EquilibriumPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {1};
		System.out.println(equilibriumPoint(number,number.length));
	}
	
	public static int equilibriumPoint(int arr[],int n)
	{
		if(n==1) return 1;
		int leftSum=0;
		int rightSum=0;
		for(int i=1;i<n;i++)
		{
			rightSum=rightSum+arr[i];
		}
		for(int i=0;i<n-1;i++)
		{
			if(leftSum==rightSum)
				return i+1;
			leftSum=leftSum+arr[i];
			rightSum=rightSum-arr[i+1];
		}
		return 0;
	}

}
