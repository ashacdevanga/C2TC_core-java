import java.util.SortedMap;
		import java.util.NavigableMap;
		import java.util.TreeMap;
public class SubMap {

		public static void main(String args[])
		{
		NavigableMap<Character,String> sd=new TreeMap<Character,String>();
		sd.put('b',"Barbie");
		sd.put('a',"Angel");
		sd.put('d',"Dora");
		sd.put('c',"Charlie");
		sd.put('e',"Emy");
		System.out.println(sd);
		System.out.println(sd.subMap('b','e'));
		

	}

}
