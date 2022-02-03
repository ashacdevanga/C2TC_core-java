package collection;

import java.util.ArrayList;
import java.util.List;

public class Method5 {

	public static void main(String[] args) {

		
		List<String> val = new ArrayList<>();
		val.add("JAVA");
		val.add("is");
		val.add("Interesting");
		System.out.println("before clear :" +val);
		val.clear();
		
		System.out.println("after clear :" +val);
		
	}

}
