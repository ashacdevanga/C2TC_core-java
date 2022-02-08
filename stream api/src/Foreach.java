import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		//internal 
		/*for(int i=0; i<6; i++) {
			System.out.println(list.get(i));
		}
		//iterator 
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}
		
		//for each
		
		for(Integer i: list)
		{
			System.out.println(i);
		}*/
		//iterator 
		//for each
		list.forEach(values -> System.out.println(values));
			
	}

}
