import java.util.Arrays;
import java.util.List;

public class LazyPROOF {
	public static boolean isDivisible(int i)
	{
	System.out.println("this is divisible by maths ");	
	return i%5==0;
	}
	public static int mapDouble(int i)
	{
		System.out.println("this is mapdouble by maths ");	
		return i*2;	
	}
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst());
	System.out.println(list.stream()
			.filter(LazyPROOF::isDivisible)
			.map(LazyPROOF::mapDouble)
			.findFirst().orElse(0));



	}

}
