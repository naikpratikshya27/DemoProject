package exceptionHand;

public class ExHand1 {

	public static void main(String[] args) throws InterruptedException  
	{
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("this code will always execute");
		}
		
	}

}
