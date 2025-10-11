package implementation.repeated_string;

// Problem: Repeated String
// HackerRank: https://www.hackerrank.com/challenges/repeated-string/problem
// Language: Java
// Approach: Use math to calculate repetitions and handle the remainder to avoid timeouts.
// Complexity: O(s.length()) Time, O(1) Space

import java.util.Scanner;

public class Solution {

    public static long repeatedString(String s, long n) {
        long sLength = s.length();

        // 1. Count 'a's in the base string s
        long countInS = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countInS++;
            }
        }

        // 2. Calculate how many times the full string s is repeated
        long fullRepeats = n / sLength;

        // 3. Calculate 'a's from these full repetitions
        long totalAs = fullRepeats * countInS;

        // 4. Calculate the length of the remaining substring
        long remainderLength = n % sLength;

        // 5. Count 'a's in the remaining substring part
        for (int i = 0; i < remainderLength; i++) {
            if (s.charAt(i) == 'a') {
                totalAs++;
            }
        }

        return totalAs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long n = sc.nextLong();

        long result = repeatedString(s, n);
        System.out.println(result);

        sc.close();
    }
}

