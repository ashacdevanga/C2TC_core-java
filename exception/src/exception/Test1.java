package exception;

public class Test1 {

	public static void main(String[] args) {
		class Bike{
			public void petrol() {}
			}
			Bike fz = null;
			try{
			fz.petrol();
			}
			catch(NullPointerException e){
			System.out.print("There is a NullPointerException ");
			}
			catch(Exception e){
			System.out.print("There is an Exception. ");
			}
			System.out.print("Everything went fine ");
			}
			

	

}
