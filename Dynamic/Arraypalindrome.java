package Dynamic;

public class Arraypalindrome {
	public static void main(String[] args) {
		String[] arr={"Dwaraka", "Gadag", "Ayodhya", "lava", "Tippudrop", "Ziliz"};
		
		for(int j=0; j<arr.length; j++)
		{
			if(j%2==1)
			{
			String str=arr[j];
			reverse(str);	
		}
	}
	}
	

	static void reverse(String str)
	{
		String reverse="";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println(str + " is a palindrome");
		}else
		{
			System.out.println(str +" is not a palindrome");
		}
	}
}
