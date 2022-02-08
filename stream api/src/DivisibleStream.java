

import java.util.Arrays;
import java.util.List;

public class DivisibleStream {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50,60);
		//internal
		System.out.println(list.stream().filter(i->i%5==0).reduce(0,(c,e)->(c+e)));
		//external
		System.out.println(list.stream().filter(i->i%5==0).reduce(0,(c,e)->Integer.sum(c, e)));
		//method reference
		System.out.println(list.stream().filter(i->i%5==0).reduce(0,Integer::sum));
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->(c+e)));
	}
	}


