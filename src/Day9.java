/*
Task
Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! ( N factorial).
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day9 {

    static int factorial(int n) {
        int result=1,facto=1;
        while(n>1){

            result = facto*n;
            n=n-1;
            facto =result;
        }


        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //env OUTPUT_PATH=/path/to/some/file java Solution;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
