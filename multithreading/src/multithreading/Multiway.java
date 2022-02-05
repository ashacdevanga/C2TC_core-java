package multithreading;
class Threadingt0 extends Thread {
	 public void run()
	 {
		 for(int i=0;i<5;i++) {
		 System.out.println("threading is working now........" + " " + Thread.currentThread());
	 }
	
}
class multithreading0 extends Thread{
	 public void run()
	 {
		 for(int i=0;i<5;i++) {
		 System.out.println("multithreading is working now........" + " " + Thread.currentThread());
	 }
}

public class Multiway {

	public static void main(String[] args) {
		Threadingt0 td=new Threadingt0();
		Thread t0=new Thread(td);
		t0.start();
		multithreading0 md= new multithreading0();
		Thread t00=new Thread(md);
		t00.start();

	}

}
}
}