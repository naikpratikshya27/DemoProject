package thirty1stbatch;

public class SwitchFallThroughCase {

	public static void main(String[] args) {
		int n = 20;
		switch(n)
		{
		case 10:
			System.out.println("i am 10");
			
		
		case 20:
			System.out.println("i am 20");
			
			
		case 30:
			System.out.println("i am 30");
			
			
		default:
			System.out.println("none of the above is matching");
		}

      System.out.println("this belongs to main method");
	}

}
