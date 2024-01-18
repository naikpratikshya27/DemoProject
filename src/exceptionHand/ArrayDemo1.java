package exceptionHand;

import java.util.Arrays;

public class ArrayDemo1
{

	public static void main(String[] args) 
	{
		String s[]= {"ajay","kartik","akshya","srk","xyz"};
		System.out.println(s.length);
		System.out.println(s[0]);
		System.out.println(s[3]);
		//System.out.println(s[5]); unchecked exception
		System.out.println(Arrays.toString(s));
		s[0] = "aaliya";    //first way
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++)   //second way.
		{
			System.out.println(s[i]);
		}
		System.out.println();
		for(String k:s) //Third way
		{
			System.out.println(k);
		}
	}
		
}
	


