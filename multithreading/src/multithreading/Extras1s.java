package multithreading;
class Ecplise1 extends Thread{
	public void run() {
		System.out.println("the ecplise id working" +Thread.currentThread().getId());
		System.out.println("the ecplise id priority" +Thread.currentThread().getPriority());
	}
}
class Ecplise_Packages1 extends Thread{
	public void run()
	{
		System.out.println("the ecplise_Packages id working" +Thread.currentThread().getId());
		System.out.println("the ecplise id priority" +Thread.currentThread().getPriority());
	}
}

public class Extras1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecplise1 ec=new Ecplise1();
		ec.start();
		ec.setPriority(Thread.MIN_PRIORITY);
		Ecplise_Packages1 ep=new Ecplise_Packages1();
		ep.start();
		ep.setPriority(Thread.MAX_PRIORITY);


	}
}
