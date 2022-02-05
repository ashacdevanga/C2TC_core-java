import java.util.LinkedHashMap;

public class Map9 {

		public static void main(String args[])
		{
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(1,"one");
		map.put(2,null);
		map.put(3,"three");
		map.put(4,"four");
		map.put(null,"five");
		map.put(null,"six");
		map.put(7,null);
		System.out.println(map);
		}
	}


