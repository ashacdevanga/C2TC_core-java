package listinterface1;

import java.util.LinkedList;

public class Method17 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("hello");
		list.add("GeM");
		list.add(4);
		list.add("GREY");
		list.add("8");
		System.out.println("The initial list is :" + list);
		System.out.println("Head of the list : " + list.peekFirst());
	}

}
