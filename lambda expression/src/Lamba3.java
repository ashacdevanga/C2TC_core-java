interface Drawable{
	public void Draw(int radius) ;
		
	}

public class Lamba3 {

	public static void main(String[] args) {
		Drawable d=(int radius)->
		{
			System.out.println("Drawable the circle of the blank paper\n" +radius);
		};
    d.Draw(10);
	}

}
