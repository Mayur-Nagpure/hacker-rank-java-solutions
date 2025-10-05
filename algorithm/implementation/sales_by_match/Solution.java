package implementation.sales_by_match;

// Problem: Sales by Match (Sock Merchant)
// HackerRank: https://www.hackerrank.com/challenges/sock-merchant/problem
// Language: Java
// Approach: Use a HashSet to track unpaired socks and count pairs.
// Complexity: O(n) Time, O(c) Space

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> unpairedSocks = new HashSet<>();
        int pairs = 0;

        for (int color : ar) {
            if (unpairedSocks.contains(color)) {
                // Found a pair
                pairs++;
                unpairedSocks.remove(color);
            } else {
                // This is the first sock of this color
                unpairedSocks.add(color);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
        sc.close();
    }
}
