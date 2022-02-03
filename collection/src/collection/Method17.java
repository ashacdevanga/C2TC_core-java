package collection;

import java.util.ArrayList;

public class Method17 {

	
		public static void main(String[] a)
		{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bottle");
		al.add("water");
		al.add("liquid");
		al.add("oil");
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.contains("oil"));
		al.add(2,"salt");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("oil"));
		System.out.println(al.size());
		
		
	}

}
