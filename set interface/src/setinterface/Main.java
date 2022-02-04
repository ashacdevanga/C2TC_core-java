package setinterface;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	
		public static void main(String[] args)
		{
		TreeSet<String> set = new TreeSet<String>();
		set.add("Technical");
		set.add("Technology");
		set.add("quiz");
		set.add("code");
		System.out.println("SortedSet: "+ set);
		Iterator value = set.iterator();
		System.out.println("After Iterator:");
		while (value.hasNext())
		{
		System.out.println(value.next());
		}
		}
		}
		


