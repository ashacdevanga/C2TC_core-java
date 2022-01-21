interface Interface1
{
public void myMethod();
}
interface Interface2
{
public void myMethod();
}
public class Main122 implements Interface1, Interface2
{
public void myMethod()
{
System.out.println("Implementing more than one interfaces");
}
public static void main(String args[])
{
Main122 obj = new Main122();
obj.myMethod();
} }
