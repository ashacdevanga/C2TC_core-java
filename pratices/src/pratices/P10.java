package pratices;

import java.util.TreeSet;

public class P10 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(3);
		set.add(67);
		set.add(90);
		set.add(678);
		set.add(0);
		System.out.println("Initial Set: "+set);
		System.out.println("Tail Set:" +set.tailSet(90));
	

	}

}
