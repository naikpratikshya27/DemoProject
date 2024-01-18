package exceptionHand;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> fruit=new ArrayList<String>(); //ArrayList comes under java.util package....
		fruit.add("Mango"); //index 0
		fruit.add("Apple"); //index 1
		fruit.add("Orange"); //index 2 
		fruit.add("Banana"); //index 3
		fruit.add("Mango"); //index 4
		fruit.add("Pomegranate"); //index 5
		System.out.println(fruit);
		System.out.println(fruit.size());
		System.out.println(fruit.get(2));
		//System.out.println(fruit.get(6));                  index out of bound exception
		fruit.remove(4); // remove the element of specified index
		System.out.println(fruit);
		fruit.add(0, "Papaya"); //REPLACE THE VALUE
		fruit.add("xyz"); // adds method is responsible to insert in the right hand side.
		System.out.println(fruit);
		System.out.println(fruit.contains("Banana"));
		//fruit.clear(); //Clear all the elements in the ArrayList
		System.out.println(fruit);
		//for loop
		for(int i=0; i<fruit.size();i++)
		{
			System.out.println(fruit.get(i));
		}
		System.out.println('\n'); //giving space of two lines
		//for each loop
		for(String food:fruit) 
		{
			System.out.println(food);
		}
		
		

	}

}
