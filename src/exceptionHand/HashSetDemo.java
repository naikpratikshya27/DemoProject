package exceptionHand;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(30);
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove(10);
		System.out.println(hs);
		System.out.println(hs.contains(10));
		//hs.clear();
		System.out.println(hs);
		//for each loop
		for(int k:hs)
		{
			System.out.println(k);
		}
		

	}

}
