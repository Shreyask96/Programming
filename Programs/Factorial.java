package Programs;

public class Factorial {
	
	static int facts(int no)
	{
		int fact=1;
		
		for(int i=no; i>=1; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int x=facts(5);
		System.out.println(x);
	}
}
