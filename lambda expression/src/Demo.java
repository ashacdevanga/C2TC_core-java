interface fly{
	public void demo();
}
public class Demo {

	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("i am method ");
			}).start();
	
	}

	}
