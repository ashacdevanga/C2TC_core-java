package ashacct2c;

public class Main11 {
	public void finalize()
	{
		System.out.println("object is the grabage collector");
	}

	public static void main(String[] args) {
		new Main11();
		new Main11();
		System.gc();
		

	}

}
