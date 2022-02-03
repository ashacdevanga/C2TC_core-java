package listinterface1;
import java.util.*;
public class Method20 {

	
		public static void main(String[] args)
		{
		LinkedList list = new LinkedList();
		list.add("GeM");
		list.add(4);
		list.add("GREY");
		list.add(8);
		list.add(10);
		System.out.println("The initial Linked List is : " + list);
		System.out.println(list.pollLast());
		System.out.println("The Linked List is : " + list);
		

	}

}
