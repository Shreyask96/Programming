package Dynamic;

public class ArrayReverse {
	public static void main(String[] args) {
		String[] arr={"Brindravan", "Kedarnath", "Dwaraka", "Ayodhya", "Tripura"};
		
		for(int j=0; j<arr.length; j++)
		{
			String str=arr[j];
			reverse(str);	
		}
	}
	static void reverse(String str)
	{
		String reverse="";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}
