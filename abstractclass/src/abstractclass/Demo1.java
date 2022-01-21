package abstractclass;
abstract class shape{
	abstract void draw();
	}
class Rectangle extends shape{
	void draw()
	{
		System.out.println("drawing rectangle\n");
	}
}
	class Cricle extends Rectangle{
			void draw() {
				System.out.println("drawing the cricle\n");
				
			}
	
}

public class Demo1 {

	public static void main(String[] args) {
		shape C=new Cricle();
		shape C1=new Rectangle();
		C.draw();
		C1.draw();

	}

}
