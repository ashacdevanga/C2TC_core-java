package listinterface1;

import java.util.LinkedList;

public class Method11 {

	
		public static void main(String [] args) {
			LinkedList<String> ll=new LinkedList<String>();
			ll.add("amit");
			ll.add("Vijay");
			ll.add("Harsh");
			ll.add("Gaurav");
			ll.add("Harsh");
			ll.add("Amit");
			ll.removeLastOccurrence("Amit");
			System.out.println("After invoking removeLastOccurrence() method: "+ll);
			

	}

}
