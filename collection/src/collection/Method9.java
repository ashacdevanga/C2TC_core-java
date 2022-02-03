package collection;

import java.util.ArrayList;
import java.util.List;

public class Method9 {
		public static void main(String a[])
		{
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("1");
		arrlist.add("2");
		arrlist.add("3");
		arrlist.add("Random");
		arrlist.add("click");
		System.out.println("Actual ArrayList:"+arrlist);
		List<String> list = arrlist.subList(0,4);
		System.out.println("Sub List: "+list);
		

	}

}
