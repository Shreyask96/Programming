package Dynamic;

public class Array {
	public static void main(String[] args) {
		int[] arr={73837,5439,1735,86768,9143,9731379,32123,89798};
		
		for(int i=0; i<arr.length; i++)
		{
			palindrome(arr[i]);
		}
		
	}

	
	static void palindrome(int no)
	{
		int reverse=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			reverse=reverse*10+rem;
			
			no=no/10;
		}
		if(copy==reverse)
		{
			System.out.println(copy + " is a palindrome");
			
			while(copy>9)
			{
				copy=happynum(copy);
			}
			if(copy==1 || copy==7)
			{
				System.out.println(copy + " is a Happy number");
			}else
			{
				System.out.println(copy + " is not a Happy number");
			}
		}else 
		{
			System.out.println(copy + " is not a Palindrome");
			while(copy>9)
			{
				copy=singledigit(copy);
			}
			fact(copy);
		}
	}
	
	
	
	static int happynum(int no)
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
	
	
	
	static int singledigit(int no)
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
	
	
	static void fact(int no)
	{
		int fact=1;
		for(int i=no; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " + no + " is " + fact);
		}
}
			
	
	
