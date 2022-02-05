import java.util.Map;
		import java.util.HashMap;
public class GET1 {

	
		public static void main(String [] args)
		{
		Map<String,String> map=new HashMap<>();
		map.put("Name","Tanay");
		map.put("Occupation","Engineer");
		map.put("Country","India");
		System.out.println(map.get("Name"));
		System.out.println(map.get("Occupation"));
		System.out.println(map.get("Country"));
		
	}

}
