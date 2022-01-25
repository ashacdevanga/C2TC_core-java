package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class M1 {
		public void checkFileNotFound()
		{
		try
		{
		FileInputStream in = new FileInputStream("input.txt");
		System.out.println("This is not printed");
		}
		catch (Exception fileNotFoundException)
		{
		System.out.println(fileNotFoundException+"file not found exception");
		}
		}
		public static void main(String[] args)
		{
		M1 example = new M1();
		example.checkFileNotFound();
		} 
	}


