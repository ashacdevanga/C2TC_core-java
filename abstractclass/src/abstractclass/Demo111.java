package abstractclass;
abstract class Bike12{
	Bike12 ()
	{
	System.out.println("my dear student be safe rideing bike and its help full u ur life\n");	
	}
 abstract void run();
 void change() {
	 System.out.println("control ur speed\n");
 }
}
class Honda12 extends Bike12{
	void run() {
		System.out.println("and helps to other also \n");
	}
}
public class Demo111 {

	public static void main(String[] args) {
		Honda12 h=new Honda12();
		h.run();
		h.change();
	}

}
