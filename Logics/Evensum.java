package Logics;

public class Evensum {
	static void sumofsquare(int[] arr)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0 && arr[i]<9)
			{
			sum=sum+(arr[i]*arr[i]);
		}
		}
			System.out.println(sum);
	}
	
	
//	static void sumofsingle(int[] arr)
//	{
//		int sum=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]>0 && arr[i]<9)
//			{
//				sum=sum+arr[i];
//			}
//		}
//		System.out.println(sum);
//	}
//	
	
	
	
//	static void oddarray(int[] arr)
//	{
//		int oddsum=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			if(i%2==1)
//			{
//				oddsum=oddsum+i;
//			}
//		}
//		System.out.println(oddsum);
//		
//	}
//	
//	
//	static void evenarray(int[] arr)
//	{
//		int evensum=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			if(i%2==0)
//			{
//				evensum=evensum+i;
//			}
//		}
//		System.out.println(evensum);
//		
//	}
public static void main(String[] args) {
//	int[] arr={1,2,3,4,5};
//	evenarray(arr);
//	oddarray(arr);
	int[] arr={13,2,32,4,5};
	//sumofsingle(arr);
	
	sumofsquare(arr);
	
}

	
}
