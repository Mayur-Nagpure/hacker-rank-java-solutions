# Beautiful Days at the Movies

🔗 [Problem Link](https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem)  
💻 Language: Java

### Problem
A day, represented by an integer, is considered **beautiful** if the absolute difference between the number and its reverse is evenly divisible by a given integer **k**.

Given a range of days `[i, j]` and a divisor `k`, find the total number of beautiful days.

### Approach
- Iterate through each day from `i` to `j`.
    1. For each `day`, calculate its reverse.
    2. Compute the absolute difference: `abs(day - reverse(day))`.
    3. Check if the `difference % k == 0`.
    4. If it is, increment a `beautifulDaysCount`.
- After the loop, the `beautifulDaysCount` is the answer.

### Complexity
- **Time:** `O((j - i) * D)` where `D` is the number of digits in the largest number in the range. This is because reversing a number takes time proportional to its number of digits.
- **Space:** `O(1)` as we only use a few variables to store the count and intermediate calculations.
