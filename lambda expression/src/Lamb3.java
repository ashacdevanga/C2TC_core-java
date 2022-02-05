interface  addtion{
	public int add(int a, int b);
	
}
public class Lamb3 {

	public static void main(String[] args ) {
		addtion a1=(int a,int b)->(a+b);
		{
			System.out.println(a1.add(10, 20));
			System.out.println("The addtion will be working with adding two elements:");
		};
		

	}

}
