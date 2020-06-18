import java.util.Scanner;

/*
 * Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed 
characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.
 */
public class Day6 {
	
	public void printCharacters(String str) {
		String even = "";
		String odd = "";
		for(int i=0; i<str.length(); i++) {
			
			if(i%2 ==0) {
				
				 even +=str.charAt(i);
			}else {
				odd +=str.charAt(i);
			}
		}
		System.out.println(even+" "+odd);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
			String str = scan.next();
			Day6 string = new Day6();
			string.printCharacters(str);
			
		}
		scan.close();

	}

}
