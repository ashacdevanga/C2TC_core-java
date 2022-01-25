package exception;
import java.util.*;

public class M11 {

	public static void main(String[] args)
		{
		M11 ob = new M11();
		try
		{
		ob.meth1();
		}
		catch(ArithmeticException e)
		{
		System.out.println("ArithmaticException thrown by meth1() method is caught in main()method");
		}
		}
		
		public void meth1()
		{
		try
		{
		System.out.println(100/0);
		}
		catch(NullPointerException nullExp)
		{
		System.out.println("We have an Exception- "+nullExp);
		}
		System.out.println("Outside try-catch block");
	}

}
