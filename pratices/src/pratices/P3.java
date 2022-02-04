package pratices;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class P3 {

	
		public static void main(String a[])
		{
		TreeSet<String> ts = new TreeSet<String>(Arrays.asList("red", "orange","blue","green","white","brown","yellow","black"));
		System.out.println(ts);
		NavigableSet<String> subSet = ts.subSet("green",false,"white",true);
		System.out.println("sub set: "+subSet);
		subSet = ts.subSet("green",true,"white",true);
		System.out.println("sub set: "+subSet);
		subSet = ts.subSet("green",false,"white",false);
		System.out.println("sub set: "+subSet);
		
	}

}
