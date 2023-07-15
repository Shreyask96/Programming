package Dynamic;

public class Arrayelements2 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int evensum=0;
		int oddsum=0;
		for(int j=0; j<arr.length; j++)
		{
			
			if(arr[j]%2==0)
			{
				evensum=evensum+j;
			}else
			{
				oddsum=oddsum+j;
			}
		}
			System.out.println(evensum-oddsum);
	}
}
