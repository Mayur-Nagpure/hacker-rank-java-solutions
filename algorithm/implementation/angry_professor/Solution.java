package implementation.angry_professor;

// Problem: Angry Professor
// HackerRank: https://www.hackerrank.com/challenges/angry-professor/problem
// Language: Java
// Approach: Count on-time students and compare with threshold
// Complexity: O(n) per test case

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // number of students
            int k = sc.nextInt(); // threshold
            int onTime = 0;

            for (int i = 0; i < n; i++) {
                int arrival = sc.nextInt();
                if (arrival <= 0) {
                    onTime++;
                }
            }

            if (onTime >= k) {
                System.out.println("NO");  // class is not cancelled
            } else {
                System.out.println("YES"); // class is cancelled
            }
        }

        sc.close();
    }
}

