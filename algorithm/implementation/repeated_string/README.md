# Repeated String

🔗 [Problem Link](https://www.hackerrank.com/challenges/repeated-string/problem)  
💻 Language: Java

### Problem
A string, `s`, of lowercase English letters is repeated infinitely. Given an integer, `n`, find the number of occurrences of the letter 'a' in the first `n` characters of the infinite string[103].

**Constraint:** The value of `n` can be up to 10^12, so a solution that builds the string will be too slow and memory-intensive[107].

### Approach
The key is to use math to calculate the occurrences instead of simulating the string creation[105].

1.  **Count 'a's in the base string `s`:** First, iterate through the original string `s` once to find how many times the letter 'a' appears in it. Let's call this `countInS`.

2.  **Calculate full repetitions:** Determine how many times the entire string `s` fits into the first `n` characters. This can be calculated by `fullRepeats = n / s.length()`.

3.  **Count 'a's from full repetitions:** The number of 'a's from these complete repetitions is `totalAs = fullRepeats * countInS`.

4.  **Handle the remainder:** There might be a leftover portion of the string at the end. The length of this remaining part is `remainderLength = n % s.length()`.

5.  **Count 'a's in the remainder:** Iterate from the beginning of `s` for `remainderLength` characters and count the number of 'a's in this prefix. Let's call this `countInRemainder`.

6.  **Final Calculation:** The total number of 'a's is `totalAs + countInRemainder`[108][110].

### Complexity
-   **Time:** `O(s.length())` because we only need to iterate through the original string `s` a couple of times at most. The complexity does not depend on `n`[105].
-   **Space:** `O(1)` as we only use a few variables for our calculations.
