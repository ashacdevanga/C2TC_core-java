package MyPackage;

public class MyClass {
		
		public void getNames(String s)
		{
		System.out.println(s);
		}
	}
 class PrintName
{
public static void main(String args[])
{
String name = "Welcome to C2TC Program";
MyClass obj = new MyClass();
obj.getNames(name);
}
}


