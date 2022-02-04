package pratices;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class P4 {

	
		public static void main(String a[])
		{
		String[] strArr = {"one","two","three","four","four","Five"};
		List<String> tmpList = Arrays.asList(strArr);
		TreeSet<String> unique = new TreeSet<String>(tmpList);
		System.out.println(unique);
		

	}

}
