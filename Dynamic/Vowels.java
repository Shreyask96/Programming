package Dynamic;

public class Vowels {
	public static void main(String[] args) {
		String[] arr={"ankara", "adelaide", "atlanta", "abudhabi", "varanasi"};
		
		for(int j=0; j<arr.length; j++)	
		{
			String str= arr[j];
			vowels(str);	
		}
	}
		static void vowels(String str)
		{
			int count=0;
			
			for(int i=0; i<str.length(); i++)
			{
				char ch=str.charAt(i);
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

