package Programs;

public class CheckedException {
	public static void main(String[] args) {
		System.out.println("******Main Starts*****");

			int i=32/2;
			int[] arr={1,2,3,4,5,6,7,8,9};
					try{
						System.out.println(arr[i]);
			           }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("handled");
		}
		System.out.println("******Main starts*******");
	}
}
