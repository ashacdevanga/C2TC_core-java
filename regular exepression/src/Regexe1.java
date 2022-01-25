import java.util.regex.*;
public class Regexe1 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "ammmna"));
		
		
	}

}
