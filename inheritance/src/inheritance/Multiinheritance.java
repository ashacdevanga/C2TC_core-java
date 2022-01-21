package inheritance;

class Animal1{
	
   void eat()
	{
		System.out.println("the eating ................\n");
	}
}
	class Dog2 extends Animal1
	{
		void brak()
		{
			System.out.print("barking.....................\n");
		}
	}
	class Baby extends Dog2{
		void weep()
		{
			System.out.println("weeping.....................");
		}
	}

public class Multiinheritance {

	public static void main(String[] args) {
		
		Baby b=new Baby();
		b.brak();
		b.eat();
		b.weep();
	}

}
