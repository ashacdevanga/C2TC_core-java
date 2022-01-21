package inheritance;
      class Animal111{
				
			   void eat()
				{
					System.out.println("the eating ................\n");
				}
			}
				
				class Dog111 extends Animal{
					void meow()
					{
						System.out.println("weeping.....................");
					}
					void bark()
					{
						System.out.print("barking........................");
					}
					void  work()
					{
						super.eat();
						bark();
						
					}
				}

			public class Exee {

				public static void main(String[] args) {
					
				Dog111 b=new Dog111();
					b.work();
				}
			
		



	}


