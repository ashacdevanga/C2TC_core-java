package dataandtime;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Display111 {

		public class MyClass {
		public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern
		("E,MMM dd yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After Formatting: " + formattedDate);
		}
		}
	}


