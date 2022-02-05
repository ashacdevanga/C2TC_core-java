import java.util.NavigableMap;
		import java.util.TreeMap;
public class Tree2 {
    public static void main(String args[])
		{
		NavigableMap<Integer,String> httpcode=new TreeMap<Integer,String>();
		httpcode.put(103,"May");
		httpcode.put(100,"the");
		httpcode.put(102,"Fourth");
		httpcode.put(200,"be with");
		httpcode.put(205,"you");
		System.out.println(httpcode);
		System.out.println(httpcode.firstEntry());
		System.out.println(httpcode.lastEntry());
		}
		

	}


