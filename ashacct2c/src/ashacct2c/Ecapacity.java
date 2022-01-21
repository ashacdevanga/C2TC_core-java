package ashacct2c;

public class Ecapacity {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append(" java is my favourite language");
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		

	}

}
