package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method10 {

	
		public static void main(String[] args)
		{
		List<String> list = new ArrayList<>();
		list.add("practice");
		list.add("code");
		list.add("every");
		list.add("day");
		System.out.println("Original List : " + list);
		Collections.rotate(list, 2);
		System.out.println("Rotated List: " + list);
		
	}

}
