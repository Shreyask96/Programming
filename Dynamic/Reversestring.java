package Dynamic;

public class Reversestring {
	public static void main(String[] args) {
		String str= "hello java how are you";
	//	String str= "you are how java hello";
		
		String[] s1=str.split(" ");
	
		
	for(int i=0; i<s1.length; i++)
	{
		reverse(s1[i]);
	}
}
	
	
	static void reverse(String s1)
	{
		String reverse="";
		
		for(int j=s1.length()-1; j>=0; j--)
		{
			reverse=reverse+s1.charAt(j);
			
		}
		System.out.print(reverse+ " ");
	}
}
