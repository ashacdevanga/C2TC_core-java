package array1D2D;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr_size=sc.nextInt();
		int arr[]=new int[arr_size];
		int i;
		for(i=0; i<arr_size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int search_elm=sc.nextInt();
		int count=0;
		for(i=0; i<arr_size; i++)
		{
			if(arr[i]==search_elm)
			{
				count++;
				
			}
			
		}
		System.out.print(count);
		
		
	}

}
