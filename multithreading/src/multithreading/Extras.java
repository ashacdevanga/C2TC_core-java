package multithreading;
class Ecplise extends Thread{
	public void run() {
		System.out.println("the ecplise id working" +Thread.currentThread().getId());
		System.out.println("the ecplise id priority" +Thread.currentThread().getPriority());
	}
}
class Ecplise_Packages extends Thread{
	public void run()
	{
		System.out.println("the ecplise_Packages id working" +Thread.currentThread().getId());
		System.out.println("the ecplise id priority" +Thread.currentThread().getPriority());
	}
}
public class Extras {

	public static void main(String[] args) {
		Ecplise ec=new Ecplise();
		ec.start();
		Ecplise_Packages ep=new Ecplise_Packages();
		ep.start();

	}

}
