package examples;

public class Q17CheckSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="abhdc";
		isSubSequence(str1,str2);
	}
	public static boolean isSubSequence(String str1,String str2)
	{
		char charArrayStr1[]=str1.toLowerCase().toCharArray();
		char charArrayStr2[]=str2.toLowerCase().toCharArray();
		int cnt=0;
		for(int i=0;i<charArrayStr1.length;i++)
		{
			int flag=0;
			for(int j=i;j<charArrayStr2.length;j++)
			{
				if(flag==0)
				{
					if(charArrayStr1[i]==charArrayStr2[j])
					{
						cnt++;
						flag=1;
					}
				}
			}
		}
		if(cnt==str1.length())
		{
			System.out.println(str1+" is subsequence of "+str2);
			return true;
		}
		else 
		{
			System.out.println("Not Subsequence");
			return false;
		}
		
		
	}

}
