package src.examples;

public class Q19MergeTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mergeStrings("HELLO","BYE"));
	}
	public static String mergeStrings(String str1,String str2)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0,j=0;i<(str1.length()+str2.length());i++)
		{
			if(i<str1.length())
				sb.append(str1.charAt(i));
			if(j<str2.length())
			{
				sb.append(str2.charAt(j));
				j++;
			}
		}
		return sb.toString();
	}

}
