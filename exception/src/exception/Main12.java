package exception;

public class Main12 {

	public static void main(String[] args) 
		{
		String[] s = {"Hello", "423", null,"Hi"};
		for (int i = 0; i < 5; i++)
		{
		try{
		int a = s[i].length() +Integer.parseInt(s[i]);
		System.out.println(a);
		}
		catch(NumberFormatException ex)
		{
		System.out.println("NumberFormatException");
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
		System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (NullPointerException ex)
		{
		System.out.println("NullPointerException");
		}
		System.out.println("continuing…");
		}
		

	}

}
