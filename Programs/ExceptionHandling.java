package Programs;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("******Mainstarts******");
				try{
					int i=1/0;
				}
				catch(ArithmeticException E)
				{
					System.out.println("Handled");
				}
				System.out.println("*****Main ends******");
	}
}
