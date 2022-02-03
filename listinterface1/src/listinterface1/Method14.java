package listinterface1;

import java.util.LinkedList;

public class Method14 {

	
		public static void main(String args[]){
			LinkedList<String> list = new LinkedList<String>();
			list.add("River");
			list.add("sea");
			list.add("salt");
			list.add("liquid");
			System.out.println(list);
			String s = "sea";
			boolean c = list.contains(s);
			if(c){
			System.out.println(list.indexOf(s)); }
	}

}
