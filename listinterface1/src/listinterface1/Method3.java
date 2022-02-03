package listinterface1;

import java.util.LinkedList;

public class Method3 {

	
			public static void main(String args[] ) {
			LinkedList<String> ll=new LinkedList<String>();
			ll.add("Ravi");
			ll.add("Vijay");
			LinkedList<String> ll2=new LinkedList <String>();
			ll2.add("Sonoo");
			ll2.add("Hanumat");
			ll2.addAll(ll);
			System.out.println("After invoking addAll method: "+ll);
			System.out.println("After invoking addAll method: "+ll2);
			


	}

}
