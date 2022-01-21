interface Vehicle
{
void Engine();
}
interface Bike implements Vehicle
{
void getMileage();
}
class R15 implements Bike {
public void getMileage()
{
System.out.print("Mileage is 40 Km/L");
}
}
public class Main11{
public static void main(String args[])
{
R15 bike = new R15();
bike.getMileage();
}
}



