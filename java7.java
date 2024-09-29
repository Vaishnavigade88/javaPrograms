/*Given two strings s1 and s2, your task is to merge those strings to form a new merged string. A merge
operation on two strings is described as follows: Append alternating characters from s1 and s2,
respectively, to merged String. Once all of the characters in one of the strings have been merged, append
the remaining characters in the other string to merged String.*/

import java.util.Scanner;

public class SimplePangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        scanner.close();

        if (isPangram(sentence)) {
            System.out.println(1); // It's a pangram
        } else {
            System.out.println(-1); // It's not a pangram
        }
    }

    // Method to check if the sentence is a pangram
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase(); // Convert to lowercase
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) < 0) {
                return false; // Letter not found
            }
        }
        return true; // All letters found
    }
}