import java.util.HashMap;
import java.util.Iterator;

public class Map5 {

	
		public static void main(String [] args)
		{
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("Name","Arun Kumar");
		map.put("Occupation","Developer");
		map.put("Country","India");
		System.out.println(map.get("Name"));
		Iterator<String> keySetIterator = map.keySet().iterator();
		while(keySetIterator.hasNext())
		{
		String key = keySetIterator.next();
		System.out.println(key +" " + map.get(key));
		}
		
		}
}


