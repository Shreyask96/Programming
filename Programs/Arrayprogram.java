package Programs;

public class Arrayprogram 
{
	public static void main(String[] args) {
		String str="hello java how are you";
		char[] ch=str.toCharArray();
		ch[0] = (char) (ch[0]-32);
		System.out.print(ch[0]);
		for(int i=0; i<ch.length-1; i++)
		{
			if(ch[i]==' ')
			{
				ch[i+1]=(char)(ch[i+1]-32);
			}
			System.out.print(ch[i+1]);
		}
	}	
}
