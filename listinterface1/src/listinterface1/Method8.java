package listinterface1;

import java.util.LinkedList;

public class Method8 {

	public static void main(String[] args) {
		
			LinkedList<String> ll=new LinkedList<String>();
			ll.add("Ravi");
			ll.add("Vijay");
			ll.add("Harsh");
			ll.add("Gaurav");
			ll.add("Harsh");
			ll.add("Amit");
			System.out.println("After invoking remove(index) method: "+ll);

			ll.remove(1);
			System.out.println("After invoking remove(index) method: "+ll);

	}

}
