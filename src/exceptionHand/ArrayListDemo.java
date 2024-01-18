package exceptionHand;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);  // index 0
		obj.add(20);  // index 1
		obj.add(30);  // index 2
		obj.add(40);  // index 3
		obj.add(30);  // index 4
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.get(2));
		//System.out.println(obj.get(5)); index out of bound exception
		obj.remove(0); // remove zeroth index value
		System.out.println(obj);
		obj.add(0, 99);
		System.out.println(obj);
		obj.set(3, 55);
		System.out.println(obj);
		System.out.println(obj.contains(30)); // check the element is present inside the ArrayList or not
		//for loop
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println('\n'); //giving space of two line
        //for each loop
		for(int k:obj)
		{
			System.out.println(k);
		}
	}

}
