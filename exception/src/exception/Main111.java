package exception;

public class Main111 {
	public static void main(String[] args){
		System.out.println("First line");
		System.out.println("Second line");
		try{
		int[] myIntArray = new int[]{1, 2, 3};
		print(myIntArray); }
		catch (ArrayIndexOutOfBoundsException e)
		{
		System.out.println("The array doesn't have fourth element!");
		}
		System.out.println("Third line");
		}
		public static void print(int[] arr) {
		System.out.println(arr[3]);
		}
		}
		


