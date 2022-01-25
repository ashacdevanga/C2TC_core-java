package exception;

public class M12 {

	public static void main(String[] args) {
		
		String[] s = {"Hello", "423", null, "Hi"};
		for (int i = 0; i < 5; i++)
		{
		try{
		int a = s[i].length() + Integer.parseInt(s[i]);
		System.out.println(a);
		}
		catch(NumberFormatException ex)
		{
		System.out.println("NumberFormatException");
		}
		System.out.println("Continuing.. ");
		}
		}
}

