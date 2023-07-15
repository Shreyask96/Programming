package Programs;

public class ReplaceAllmethod {
	public static void main(String[] args) {
		String str="hoga  beda   hudgi   nanna";
		{
			System.out.println(str.replaceAll("  +", " "));
		}
		
		
		String str1="hoga@123   beda@123   hudugi@123  ";
		{
			System.out.println(str1.replaceAll("@123 +"," "));
		}
		
		
		String str2="jaga##00wae##00 nee##00nu##00 gelae##00yane";
		{
			System.out.println(str2.replaceAll("##00"," "));
		}
				
	}

}
