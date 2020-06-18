import java.util.Scanner;


/*
Task
Given an array,A , of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 */
public class Day7 {
	
	//int[] numbers;
	
	public void reverseNumber(int[] number) {
		
		for(int i=0; i<number.length; i++) {

			int temp = number[i];
			number[i]= number[number.length-i-1];
			number[number.length-i-1] = temp;
			System.out.println(number);

		}
		
	}
	
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		 int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[n]);
	            arr[i] = arrItem;
	            Day7 reverseArray = new Day7();
	            reverseArray.reverseNumber(arr);
	        }

	        scanner.close();
		System.out.println("Hello");
	}

}
