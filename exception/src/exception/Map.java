package exception;

import java.util.Scanner;

class InvalidDirectionException extends Exception {
			public InvalidDirectionException(String message) {
			Super(message); } }
			class Map
			{
			static void CheckDirection(String HouseDirection, String GpsLocation)
			throws InvalidDirectionException
			{
			if(HouseDirection.equals(GpsLocation)){
			System.out.print("You are going in correct direction");
			}
			else
			throw new InvalidDirectionException("You are going in wrong direction");
			}
			

	}

			public class Collection1{
				public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				String HouseDirection = sc.next();
				String GpsLocation = sc.next();
				Map c= new Map();
				try
				{ c.CheckDirection(HouseDirection,GpsLocation);
				}
				catch(Exception e) {
				System.out.print(e);
				} } }
