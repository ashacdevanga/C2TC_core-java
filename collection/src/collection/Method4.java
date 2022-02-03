package collection;

import java.util.ArrayList;
import java.util.List;

public class Method4 {

	
		public static void main(String [] args)
		{
		List<Integer> val1 = new ArrayList<>();
		val1.add(100);
		val1.add(200);
		List<Integer> val2 = new ArrayList<>();
		val2.add(500);
		val2.add(800);
		val2.addAll(val1);
		System.out.println(val1);
		System.out.println(val2);
		
		}
		}
		