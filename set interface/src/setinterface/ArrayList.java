package setinterface;

import java.util.LinkedHashSet;

public class ArrayList {

	
		public static void main(String args[])
		{
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Banana");
		set.add("Apple");
		set.add("Lemon");
		System.out.println("The LinkedHashSet:" +set);
		Object[] arr = set.toArray();
		System.out.println("The array is:");
		for (int j = 0; j < arr.length; j++)
		System.out.println(arr[j]);
		}
		
	}


