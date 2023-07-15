package Programs;

public class Armstrong {
	
	public static void main(String[] args) {
		int no=153;
		int no1=no;
		int copy=no;
		int count=0;
		int sum=0;
		while(no1!=0)
		{
			no=no/10;
			count++;
		}
		while(no!=0)
		{
			int rem=no%10;
			sum+= Math.pow(rem,count);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not ArmStrong Number");
		}
	}
}
