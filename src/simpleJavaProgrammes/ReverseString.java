package simpleJavaProgrammes;

public class ReverseString {

	public static void main(String[] args) {
		String name = "String Operation";
		int n = name.length();
		for(int i=n-1; i>=0;i--)
		{
			System.out.println(name.charAt(i));
		}

	}
}