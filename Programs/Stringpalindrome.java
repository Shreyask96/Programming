package Programs;

public class Stringpalindrome {
	public static void main(String[] args) {
		String str="MALAYALAM";
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println(str + " is Palindrome");
		}else
		{
			System.out.println(str + " is not palindrome");
		}
	}
}
