package exception;

public class Main {

	public static void main(String[] args) {
		System.out.println("print frist line\n");
		System.out.println("print second line\n");
		int[] MyIntArray= new int[]{10,11,12};
		print(MyIntArray);
		System.out.println("print third line\n");
	}
		public static void print(int[] arr) {
			System.out.println(arr[3]);
			System.out.println("Fourth element successfully displayed!");
			} 
		
		
	}


