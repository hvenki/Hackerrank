import java.util.Scanner;

/*
 * Objective
Today, we're discussing data types. Check out the Tutorial tab for learning materials and an instructional video!

Task
Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:

Declare 3 variables: one of type int, one of type double, and one of type String.
Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
Use the + operator to perform the following operations:
Print the sum of i plus your int variable on a new line.
Print the sum of d plus your double variable to a scale of one decimal place on a new line.
Concatenate s with the string you read as input and print the result on a new line.
 */
public class Day1_data_type {

	
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int input_int = scan.nextInt();
        double input_double = scan.nextDouble();
        scan.nextLine();
        String input_string = scan.nextLine();
        
        
        System.out.println(i+input_int);
        System.out.println(d+input_double);
        System.out.println(s+input_string);

        

        scan.close();

}
}
