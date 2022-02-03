package listinterface1;

import java.util.LinkedList;

public class Method7 {

	public static void main(String[] args) {
			LinkedList<String> ll=new LinkedList<String>();
			ll.add("Ravi");
			ll.add("Vijay");
			ll.add("Harsh");
			ll.add("Gaurav");
			ll.add("Harsh");
			ll.add("Amit");
			System.out.println("After invoking remove(object) method: "+ll); 

			ll.remove("Vijay");
			System.out.println("After invoking remove(object) method: "+ll); }

}


