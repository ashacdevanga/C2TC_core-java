package pratices;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class P9 {
public static void main(String a[])
		{
		TreeSet<String> ts = new
		TreeSet<String>(Arrays.asList("red","orange","blue","green","white","brown","yellow","black"));
		System.out.println(ts);
		Set<String> subSet = ts.subSet("green", "yellow");
		System.out.println("sub set: "+subSet);
		subSet = ts.subSet("black", "brown");
		System.out.println("sub set: "+subSet);
		
	}

}
