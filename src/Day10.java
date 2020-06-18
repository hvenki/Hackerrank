/*
Task
Given a base-10 integer,n , convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum
number of consecutive 1's in n's binary representation.
 */

import java.util.Scanner;

public class Day10 {

    public static String convBinary(int number) {

        String binary = "";
        if (number > 0) {
            binary = Integer.toBinaryString(number);
        }
        return binary;

    }

    public static int findCount(String str) {


        char[] array = str.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];


            // Initialize result
            int count = 0;

            // Count the number of iterations to
            // reach x = 0.
            while (array != 0) {
                // This operation reduces length
                // of every sequence of 1s by one.
                x = (x & (x << 1));

                count++;
            }

            return count;
        }
        /*for (int i = 0, j = 0; i <= str.length() - i; i = j) {

            int count = 1;
            while (++j < str.length() && array[i] == array[j]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = array[i];
            }
        }
            return (maxCount);
        }*/


        public static void main (String[]args)
        {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String value = convBinary(n);
            System.out.println("number of consecutive 1's in " + value + "'s binary representation " + findCount(value));
            scanner.close();
        }
    }

