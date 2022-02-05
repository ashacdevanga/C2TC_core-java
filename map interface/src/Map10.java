import java.util.*;
public class Map10 {

		public static void main(String[] args)
		{
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "laptop");
		hash_map.put(2, "computer");
		hash_map.put(3, "smartphone");
		hash_map.put(4, "headphone");
		hash_map.put(5, "charger");
		System.out.println(hash_map.containsKey(2));
		System.out.println(hash_map.containsKey(45));
		System.out.println(hash_map.containsValue("computer"));
		System.out.println(hash_map.containsValue("table"));
		}

}
