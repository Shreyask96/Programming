package Dynamic;

import java.util.Scanner;

public class Primenumbers{
	static void prime(int no)
	{
		boolean flag=true;
		
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Prime number");
		}else
		{
			System.out.println("Not prime number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Int");
		int no=sc.nextInt();
		prime(no);
		
		
		
	}
}

