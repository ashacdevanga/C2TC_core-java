package exception;

import java.util.Scanner;
		class InvalidbloodDonateException extends Exception {
			InvalidbloodDonateException(String s){
			super(s); } }
			public class M4 {
			static void validate(int age,int weight)throws InvalidbloodDonateException
			{
			if(age<18 && weight <55)
			throw new InvalidbloodDonateException("Not Eligible");
			else
			System.out.println("Can Donate Blood"); }
			public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			int weight = sc.nextInt();
			try{
			validate(age, weight); }
			catch(Exception m) {
			System.out.println("Exception occured: "+m);
			}
			System.out.println("rest of the code...");
			}
			
			
	}


