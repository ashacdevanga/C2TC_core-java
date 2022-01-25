import java.util.regex.Pattern;
import java.util.regex.*;
public class Regexe121 {

	public static void main(String[] args) {
		System.out.println("metacharacters d....");
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "4443"));
		System.out.println(Pattern.matches("\\d", "323abc"));
		

	}

}
