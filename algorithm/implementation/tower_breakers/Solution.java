package implementation.tower_breakers;

// Problem: Tower Breakers
// HackerRank: https://www.hackerrank.com/challenges/tower-breakers-1/problem
// Language: Java
// Approach: Analyze game rules based on parity of n and value of m.
// Complexity: O(1) per test case

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of towers
            int m = sc.nextInt(); // height of each tower

            // Determine the winner based on the logic
            // If m is 1, Player 1 can't make a move, so Player 2 wins.
            // If n is even, Player 2 can mirror Player 1's moves, so Player 2 wins.
            // Otherwise (n is odd and m > 1), Player 1 wins.
            if (m == 1 || n % 2 == 0) {
                System.out.println(2); // Player 2 wins
            } else {
                System.out.println(1); // Player 1 wins
            }
        }
        sc.close();
    }
}

