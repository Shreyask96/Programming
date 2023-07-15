package Dynamic;

public class StringArray {
public static void main(String[] args) {
	String[] str={"AWWA","Java","Kataka","MALAYALAM","Space","ANNA"};
	
	for(int i=0; i<str.length; i++)
	{
		palin(str[i]);
	}
}	
	
	static void palin(String str1)
	{
		String reverse="";
		
		for(int j=str1.length()-1; j>=0; j--)
		{
			reverse=reverse+str1.charAt(j);
		}
		if(str1.equals(reverse))
		{
			System.out.println(str1 + " is a Palindrome");
		}else
		{
			System.out.println(str1 + " is not a Palindrome");
		}
	}
}

