package implementation.beautiful_days_at_the_movies;

// Problem: Beautiful Days at the Movies
// HackerRank: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
// Language: Java
// Approach: Iterate through the range, reverse each number, and check if the absolute difference is divisible by k.
// Complexity: O((j-i) * log10(n)) where n is the number of digits in the day.

import java.util.Scanner;

public class Solution {

    /**
     * Reverses the digits of a given integer.
     * For example, 123 becomes 321.
     *
     * @param num The number to reverse.
     * @return The reversed number.
     */
    private static int reverseNumber(int num) {
        int reversed = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt(); // starting day
        int j = sc.nextInt(); // ending day
        int k = sc.nextInt(); // divisor

        int beautifulDaysCount = 0;

        for (int day = i; day <= j; day++) {
            int reversedDay = reverseNumber(day);
            int difference = Math.abs(day - reversedDay);

            if (difference % k == 0) {
                beautifulDaysCount++;
            }
        }

        System.out.println(beautifulDaysCount);

        sc.close();
    }
}

