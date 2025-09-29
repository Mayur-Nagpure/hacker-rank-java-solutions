package implementation.migratory_birds;

// Problem: Migratory Birds
// HackerRank: https://www.hackerrank.com/challenges/migratory-birds/problem
// Language: Java
// Approach: Use a frequency array to count occurrences and find the most common type.
// Complexity: O(n) Time, O(1) Space

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static int migratoryBirds(List<Integer> arr) {
        // Frequency array for bird types 1 through 5. Index 0 is unused.
        int[] frequency = new int[6];

        // Count the frequency of each bird type
        for (int birdType : arr) {
            frequency[birdType]++;
        }

        // Find the bird type with the maximum frequency
        int maxFrequency = 0;
        int mostCommonBird = 0;
        for (int i = 1; i <= 5; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostCommonBird = i;
            }
        }
        return mostCommonBird;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int result = migratoryBirds(arr);
        System.out.println(result);
        sc.close();
    }
}
