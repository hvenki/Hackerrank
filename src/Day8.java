/*
Task
Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated
entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Day8 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        //getting the number of entries
        int number = scan.nextInt();
        Day8 phBook = new Day8();
        for (int i = 0; i < number; i++) {

            String name = scan.next();
            Integer phone = scan.nextInt();
            phoneBook.put(name, phone);

        }

        while (scan.hasNext()) {

            String s = scan.next();
            Set<Map.Entry<String, Integer>> st = phoneBook.entrySet();
            if (phoneBook.containsKey(s)) {

                /*for (Map.Entry<String, Integer> pbook : st) {
                    System.out.println(pbook.getKey().equals("s") + "=" + pbook.getValue());
                }*/
                System.out.println(s+"="+phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        scan.close();

    }

}
