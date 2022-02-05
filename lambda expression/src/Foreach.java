import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
	 ArrayList<String> al= new ArrayList<String>();
	 al.add("i love");
	 al.add("my ");
	 al.add("family");
     al.add(" soul");
     for(String s: al) {
    	 System.out.println(s);
     }

	 

	}

}
