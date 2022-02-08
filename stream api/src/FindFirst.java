import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst());
	System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));



	}

}
