import java.util.Arrays;
import java.util.List;

public class Method_reference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		list.forEach(System.out::println);
        list.stream().limit(4).forEach(System.out::println);

	}

}
