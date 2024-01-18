package exceptionHand;

import java.util.Arrays;

public class ArrayIntDemo {

	public static void main(String[] args) {
		int a[]= new int[2];
		a[0]=10;
		a[1]=20;
		//a[2]=30;
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		//for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//for each loop
		for(int k:a)
		{
			System.out.println(k);
		}

	}

}
