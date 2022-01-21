package array1D2D;
import java.util.Scanner;
public class Arrayss {
public static void main(String[] args) {
	    int i,search;
	    int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array  given number");
	    int arr1=sc.nextInt();
	    int arr2[]=new int[arr1];
	    System.out.println("enter the element");
	    for(i=0;i<arr1;i++)
	    {
	    	arr2[i]=sc.nextInt();
	    }
	    System.out.println("enter sreach");
	    search =sc.nextInt();
	    for(i=0;i<arr1;i++)
	    {
	    	if(arr2[i]==search)
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(count);
       }
}

	    	
		
		

	


