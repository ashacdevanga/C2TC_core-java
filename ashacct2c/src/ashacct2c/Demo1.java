package ashacct2c;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int sum= 0,count= 0;
		while(sc.hasNextInt())
		{
			int num =sc.nextInt();
			sum += num;
			count++;
		}
		int mean=sum/count;
		System.out.println("mean:" +mean);
		

	}

}
