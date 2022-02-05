package multithreading;
class Ecplise2 extends Thread{
	public void run()
	{
		System.out.println("the ecplise is working:" +Thread.currentThread().getId());
		try
		{
			sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


public class Extrasssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecplise2 ec=new Ecplise2();
		ec.start();

	}

}
