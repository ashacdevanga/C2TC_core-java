

	interface Inf1
	{
	public void method1();
	}
	public class Demo implements Inf1
	{
	public void method1()
	{
	System.out.println("method1");
	}
	public static void main(String args[])
	{
	Demo obj = new Demo();
	obj.method1();
	}
	}
	


