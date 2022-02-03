package listinterface1;

import java.util.LinkedList;

public class Method9 {

	
		public static void main(String [] args) {
			LinkedList<String> ll=new LinkedList<String>();
			ll.add("Ravi");
			ll.add("Vijay");
			ll.add("Harsh");
			ll.add("Gaurav");
			ll.add("Harsh");
			ll.add("Amit");
			System.out.println("After invoking removeFirst() method: "+ll);
			ll.removeFirst();
			System.out.println("After invoking removeFirst() method: "+ll);
			ll.removeLast();
			System.out.println("After invoking removeLast() method: "+ll);
		
	}

}
