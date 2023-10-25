import java.util.Scanner;

public class EvenOddchecker {
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner (System.in);
		  int number,reminder;
	System.out.println("Enter a Number: ");
	      number = scanner.nextInt();
	      scanner.close();
	      
	     reminder = number % 2;
	     
	    if(reminder == 0) {
	    System.out.println(number +" is an even number.");
		
	    } else {
			System.out.println(number + " is an odd number.");
			}
		
	}

}
