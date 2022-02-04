package setinterface;

import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		
		TreeSet<String> sites = new TreeSet<>();
		sites.add("Technical");
		sites.add("Technology");
		sites.add("quiz");
		sites.add("code");
		System.out.println(sites);
		TreeSet<String> beforeQuiz = (TreeSet<String>) sites.headSet("quiz"); // strictly less
		TreeSet<String> afterCode = (TreeSet<String>) sites.tailSet("quiz");//strictly greater than or equalto
		System.out.println(beforeQuiz);
		System.out.println(afterCode);
		System.out.println(sites);
		
	}

}
