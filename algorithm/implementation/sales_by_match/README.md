# Sales by Match (Sock Merchant)

🔗 [Problem Link](https://www.hackerrank.com/challenges/sock-merchant/problem)  
💻 Language: Java

### Problem
Given a collection of socks represented by an array of integers (where each integer is a color ID), determine the total number of matching pairs of socks that can be formed[93].

For example, if the colors are `[10, 20, 20, 10, 10, 30, 50, 10, 20]`, there are three pairs: one pair of color `20` and two pairs of color `10`.

### Approach
An efficient way to solve this is by using a `Set` to keep track of unpaired socks. The set will only store the colors for which we have an odd sock waiting for its match[94].

1.  **Initialize:** Create a `HashSet<Integer>` to store the colors of single socks and an integer `pairs` counter, initialized to 0.
2.  **Iterate Through Socks:** Loop through each sock color in the input array.
3.  **Check for a Match:**
    *   If the current sock's color is already in the `Set`, it means we've found a matching pair. Increment the `pairs` counter and remove the color from the `Set` (as the pair is now complete).
    *   If the color is not in the `Set`, add it. This sock is now waiting for a match.
4.  **Return Result:** After iterating through all the socks, the `pairs` counter will hold the total number of complete pairs.

### Complexity
- **Time:** `O(n)`, where `n` is the number of socks. We iterate through the array of socks only once.
- **Space:** `O(c)`, where `c` is the number of unique sock colors. In the worst case (all socks are different colors), this is `O(n)`.
