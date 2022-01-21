package ashacct2c;

public class Demo {
	void m()
	{
		System.out.println(this);
		
	}

	public static void main(String[] args) {
		Demo obj=new Demo();
		Demo obj1=new Demo();
		System.out.println(obj);
		System.out.println(obj1);
		obj.m();
        obj1.m();
		
		

	}

}
