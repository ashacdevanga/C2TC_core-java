import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map16 {

	
		public static void main(String args[])
		{
		NavigableMap<Integer,String> b1=new TreeMap<Integer,String>();
		b1.put(3,"Nissan");
		b1.put(2,"Toyota");
		b1.put(1,"Honda");
		b1.put(5,"Mercedes");
		b1.put(4,"Volvo");
		b1.put(6,"Volkswagen");
		System.out.println(b1);
		System.out.println(b1);
		SortedMap<Integer,String> n1=new TreeMap<Integer,String>();
		n1 = b1.headMap(5);
		System.out.println(n1);
		SortedMap<Integer,String> m1=new TreeMap<Integer,String>();
		m1 = b1.tailMap(5);
		System.out.println(m1);
		SortedMap<Integer,String> w1=new TreeMap<Integer,String>();
		w1 = b1.subMap(3,8);
		System.out.println(w1);

	}

}
