package Dynamic;

public class Arrayelements1 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		for(int j=0; j<arr.length; j++)
		{
			int no=arr[j];
			oddeven(no);
	    }
	}
	static void oddeven(int no)
	{
		
			if(no%2==1)
			{
				System.out.print(no + " ");
			}
		
		
			if(no%2==0)
			{
				System.out.println(no);
			}
		
	}

}
