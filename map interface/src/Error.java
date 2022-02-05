import java.util.SortedMap;
import java.util.TreeMap;
public class Error {

	public static void main(String[] args) {
		
		
		SortedMap<Integer,String> b1 = new TreeMap<Integer,String>();
		b1.put(3,"Tamilnadu");
		b1.put(2,"Gujarat");
		b1.put(4,"Orissa");
		b1.put(1,"Kerala");
		System.out.println(b1);
		System.out.println(b1.decendingKeySet());

	}


}
