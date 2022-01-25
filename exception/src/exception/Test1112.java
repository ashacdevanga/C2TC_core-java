package exception;

import java.util.Scanner;

public class Test1112 {
  static void splitString(String text) {
			try {
			String[] splittedString =text.split("/");
			for(int i = 0; i < splittedString.length; i++)
			{
			System.out.println("Splitted string at index "+i+" is :"+splittedString[i]);
			}
			}
			catch(Exception e){
			System.out.println("Exception : "+e);
			}
			finally{
			System.out.println("Inside finally block");
			}
			}
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
String text = scanner.nextLine();
if(text.length()>2)
{
splitString(text);
}
else
{
splitString(null);
} } }
