package Dynamic;

import java.util.Scanner;

public class Singledigit {
	static int sum(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			
	
		no=no/10;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	int x=sum(no);
	System.out.println(x);
}
}
