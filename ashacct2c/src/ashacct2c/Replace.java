package ashacct2c;

public class Replace {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello java");
		sb.replace(6,10," "+"world programming");
		System.out.println(sb);
	}

}
