package exceptionHand;

public class ExHand2 {

	public static void main(String[] args) throws InterruptedException {
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("solution....");
		}
		finally
		{
			System.out.println("this code will execute everytime");
		}
		Thread.sleep(3000);
		System.out.println("hello");

	}

}
