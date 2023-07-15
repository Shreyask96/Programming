package Dynamic;

import java.util.Scanner;

public class Factorial {
	static int demo(int no)
	{
		int fact=1;
		for(int i=no; i>0; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
	    int no=sc.nextInt();
		int x=demo(no);
		System.out.println(x);
	}

}
