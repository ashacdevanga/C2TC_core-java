import java.util.NavigableMap;
import java.util.TreeMap;

public class Map13 {

		public static void main(String args[])
		{
		NavigableMap<Character,String> k1=new TreeMap<Character,String>();
		k1.put('b',"Barbie");
		k1.put('a',"Angel");
		k1.put('d',"Dora");
		k1.put('c',"Charlie");
		k1.put('e',"Emy");
		k1.put('t',"Tom");
		k1.put('j',"Jerry");
		System.out.println(k1);
		NavigableMap n1 = k1.descendingMap();
		System.out.println(n1);

	}

}
