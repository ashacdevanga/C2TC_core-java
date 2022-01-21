package abstractclass;
abstract class Bank{
	abstract int  rateOfInterest();
}
class HDFC extends Bank{
	int rateOfInterest() {
		return 8;
	}
}
class ICICI extends HDFC{
	int rateOfInterest()
	{
		return 9;
	}
}

public class Demo11 {

	public static void main(String[] args) {
		ICICI i=new ICICI();
        HDFC h=new HDFC();
        h.rateOfInterest();
        i.rateOfInterest();
        System.out.println("the rateof ineterest is:"+h. rateOfInterest());
        System.out.println("the rateof ineterest is:"+i. rateOfInterest());
	}

}
