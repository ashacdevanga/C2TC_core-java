interface Drawable1{
	public void Draw(int width,int length);
}
public class Lamb2 {

	public static void main(String[] args) {
		Drawable1 d=(int width, int length)->
		{
			System.out.println("draw a cube with the width and lenght \n" + width + " "+ length);
		};
	d.Draw(10,20);
	}
}
