package inheritance;
class Ani{
	String color="white";
}
class Dog12 extends Ani{
	String color="black";
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class Exe {

	public static void main(String[] args) {
		Dog12 d=new Dog12();
		d.printcolor();
	}

}
