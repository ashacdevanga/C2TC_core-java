package exception;

public class Final {

	public static void main(String[] args) {
			try{
			int data = 30/30;
			System.out.println(data);
			}
			catch(NullPointerException e)
			{
			System.out.println(e);
			}
			finally
			{
			System.out.println("finally block is always executed");
			}
			}
			}
			


