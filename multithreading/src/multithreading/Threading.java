package multithreading;
class Threading1 extends Thread {
	 public void run()
	 {
		 System.out.println("threading is working now........" + " " + Thread.currentThread());
	 }
	
}
class multithreading extends Thread{
	 public void run()
	 {
		 System.out.println("multithreading is working now........" + " " + Thread.currentThread());
	 }
}


public class Threading {

	public static void main(String[] args) {
		Threading1 td=new Threading1();
		td.start();
		multithreading md=new multithreading();
		md.start();
		
	}

}
