package Dynamic;

public class Arraysingledigit {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int j=0; j<arr.length; j++)
		{
			sum=sum+arr[j];	
		}
		singledigit(sum);
	}
	
	static void singledigit(int no)
	{
		while(no>9)
		{
			no=num(no);
		}
		System.out.println(no);
	}
	
	static int num(int no)
	{
		int sum=0;
		{
			while(no!=0)
			{
				int rem=no%10;
				
				sum=sum+rem;
				
				no=no/10;
			}
			return sum;
		}
	}
}


