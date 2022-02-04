package setinterface;

import java.util.TreeSet;

public class Sortapl {

	
		public static void main(String[] args)
		{
			TreeSet<String> sites = new TreeSet<>();
			sites.add("Technical");
			sites.add("Technology");
			sites.add("quiz");
			sites.add("code");
			System.out.println("Sorted Set: " + sites);
			System.out.println("First: " + sites.first());
			System.out.println("Last: " + sites.last());
	}

}
