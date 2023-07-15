package Programs;

public class Stringpalindrome1 {
	
	static String reverse(String str)
	{
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse=reverse+str.charAt(i);
		}
		return reverse;
	}
	
	
public static void main(String[] args) {
	String x=reverse("java");
	System.out.println(x);
	
}
}
