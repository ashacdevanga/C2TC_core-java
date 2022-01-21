package inheritance;
     class Animal11{
			
		   void eat()
			{
				System.out.println("the eating ................\n");
			}
		}
			
			class Cat extends Animal{
				void meow()
				{
					System.out.println("weeping.....................");
				}
			}

		public class Hirarical {

			public static void main(String[] args) {
				
			Cat b=new Cat();
				b.meow();
				b.eat();
				
			}
		
	}


