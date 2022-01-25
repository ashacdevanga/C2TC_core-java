package exception;

public class M111 {

			public static void validate(int age) {
			if(age<21 || age>27)
			throw new ArithmeticException("not eligible");
			else
			System.out.println("Eligible to attend Military Selection ");
			}
			public static void main(String args[]) {
			validate(30);
			System.out.println("rest of the code...");

	}

}
