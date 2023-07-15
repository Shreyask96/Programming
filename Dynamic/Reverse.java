package Dynamic;

import java.util.Scanner;

public class Reverse {
	static String rev(String str)
	{
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String x=rev(str);
		System.out.println(x);
	}

}
