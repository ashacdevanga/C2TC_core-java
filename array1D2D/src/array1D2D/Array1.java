package array1D2D;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array number given the array");
		int arr_size=sc.nextInt();
		int arr[]=new int[arr_size];
		int i;
		for(i=0;i<arr_size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int search_element=sc.nextInt();
		int is_found=0;
		for(i=0;i<arr_size;i++)
		{
			if(arr[i]==search_element)
			{
				is_found=1;
				break;
			}
		}
		if(is_found==1)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
			
		}
		

	}

}
