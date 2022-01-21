package inheritance;
class Animal{
	void eat()
	{
		System.out.println("the eating ................\n");
	}
}
	class Dog extends Animal
	{
		void brak()
		{
			System.out.print("barking.....................\n");
		}
	}

public class Singleinheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.brak();
		d.eat();
		
	}

}
