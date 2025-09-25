# Angry Professor

🔗 [Problem Link](https://www.hackerrank.com/challenges/angry-professor/problem)  
💻 Language: Java

### Problem
A class is cancelled if fewer than **k** students arrive on time.  
Given arrival times of students, determine if the class is cancelled.

### Approach
- For each test case:
    1. Read number of students `n` and threshold `k`.
    2. Count how many students have arrival time `<= 0`.
    3. If `onTime >= k`, print `"NO"` (class continues).  
       Otherwise, print `"YES"` (class is cancelled).

### Complexity
- **Time:** O(n) per test case
- **Space:** O(1)
