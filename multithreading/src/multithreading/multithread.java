package multithreading;
class Threads implements Runnable {
	 public void run()
	 {
		 System.out.println("threading is working now........" + " " + Thread.currentThread());
	 }
	
}
class multithreading1 implements Runnable{
	 public void run()
	 {
		 System.out.println("multithreading is working now........" + " " + Thread.currentThread());
	 }
}


public class multithread {

	public static void main(String[] args) {
		Threading1 td=new Threading1();
		Thread t1=new Thread(td);
		t1.start();
		multithreading md=new multithreading();
		Thread t2=new Thread(md);
		t2.start();
		
		
	}

}

