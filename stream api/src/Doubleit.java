import java.util.Arrays;
import java.util.List;

public class Doubleit {
	public static void Doubleit(int i)
	{
		System.out.println(i*2);
	}
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		//internal
		
        list.forEach(i->Doubleit(i));
        //method reference
        list.forEach(Doubleit::Doubleit);
	}

}
