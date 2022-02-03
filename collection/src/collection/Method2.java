package collection;

import java.util.ArrayList;
import java.util.List;

public class Method2 {

	
		public static void main(String [] args)
		{
		List<Integer> val = new ArrayList<>();
		val.add(0);
		val.add(11);
		val.add(23);
		val.add(34);
		val.add(45);
		System.out.println("ArrayList : " + val);
		val.remove(1);
		System.out.println("ArrayList : " + val);
		}
		}
		