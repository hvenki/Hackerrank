import java.util.Scanner;

import javax.xml.ws.AsyncHandler;

/*
 * Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
 */
public class Day3_if {
	
	public static void printWeird(int number) {
		
		if(number%2 ==1) {
			System.out.println("Weird");
		}else if(number%2 ==0) {
			if(number >=2 && number<=5) {
				System.out.println("Not Weird");
			}else if(number >=6 && number <=20) {
				System.out.println("Weird");
			}else {
				System.out.println("Not Weird");
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printWeird(n);

	}

}
