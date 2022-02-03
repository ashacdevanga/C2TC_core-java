package listinterface1;

import java.util.LinkedList;

public class Method12 {

	
		public static void main(String [] args) {
			LinkedList<String> ll=new LinkedList<String>();
			ll.add("Ravi");
			ll.add("Vijay");
			ll.add("Harsh");
			ll.add("Gaurav");
			ll.add("Harsh");
			ll.add("Amit");
			ll.clear();
			System.out.println("After invoking clear() method: "+ll);

			ll.add("Harsh");
			System.out.println("After invoking clear() method: "+ll);

	}

}
