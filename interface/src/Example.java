interface Vehicle{
void Engine();
}
interface Bike11 extends Vehicle{
void getMileage();
}
class R1511 implements Bike11{
public void Engine(){
System.out.println("Liquid-cooled SOHC 4-valve fuel-injected engine");
}
public void getMileage(){
System.out.println("Mileageis 40 Km/L");
}
}
public class Example{
public static void main(String
args[]){
R1511 bike = new R1511();
bike.getMileage();
bike.Engine();
}


	}


