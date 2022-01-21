package ashacct2c;
import java.util.Scanner;
public class Main1 {
 public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  System.out.println("*****************************************************************************");
  System.out.println("enter the student deatils");
   String  name=sc.nextLine();
   char gender=sc.next().charAt(0);
   int age=sc.nextInt();
   long mobileno=sc.nextLong();
   double cgpa=sc.nextDouble();
   System.out.println("name: "+name);
   System.out.println("gender: "+gender);
   System.out.println("age: "+age);
   System.out.println("mobile Number:"+mobileno);
   System.out.println("cgpa: "+cgpa);
   System.out.println("complete the deatils");
   System.out.println("********************************************************************************");
  


	}

}
