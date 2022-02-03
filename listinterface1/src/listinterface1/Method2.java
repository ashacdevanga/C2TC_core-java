package listinterface1;
import java.util.*;
public class Method2 {

	
		public static void main(String args[]){
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: "+ll);
		
	}

}
