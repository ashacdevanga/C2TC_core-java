package polymorphism;

class Vehicle{
	
void run()
{
System.out.println("Vehicle is running");
}
}
class Bike extends Vehicle{
void run()
{
System.out.println("Bike is running safely");
}
public static void main(String args[]){
Bike obj = new Bike();
Vehicle obj1=new Bike();
obj.run();
obj1.run();
}
}
