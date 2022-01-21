package array1D2D;
import java.util.Scanner;
public class Array11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array number given the array");
	int a=sc.nextInt();
	int arr[]=new int[a];
	for(int i=0; i<a; i++)
	{
		arr[i]=sc.nextInt();
	}
	int max=0;
	for(int i=0;i<a; i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.print(max);
	}

}
