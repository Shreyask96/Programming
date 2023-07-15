package Programs;

public class PerfectNumber {
	
	public static void main(String[] args) {
		int no=9;
		int sum=0;
		for(int i=1; i<=no/2; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
			if(no==sum)
			{
				System.out.println("Perfect Number");
			}
			else
			{
				System.out.println("Not Perfect Number");
			}
		}
	}
}
