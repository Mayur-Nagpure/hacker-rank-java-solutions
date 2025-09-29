# Migratory Birds

🔗 [Problem Link](https://www.hackerrank.com/challenges/migratory-birds/problem)  
💻 Language: Java

### Problem
Given an array of integers representing bird sightings, where each integer is a bird `type ID`, determine the `ID` of the most frequently sighted bird. If two or more types have been spotted the same maximum number of times, return the smallest of their `IDs`[75].

The bird `type IDs` are guaranteed to be 1, 2, 3, 4, or 5.

### Approach
The most efficient way to solve this is to use a frequency array (or a hash map) to count the occurrences of each bird type[76][78].

1.  **Create a Frequency Array:** Since the bird types are limited to 1-5, we can use a simple integer array of size 6 (to use indices 1 through 5) to store the counts of each bird type.
2.  **Count Frequencies:** Iterate through the input array of bird sightings. For each sighting, increment the counter for that bird type in your frequency array.
3.  **Find the Most Frequent Bird:** Iterate through the frequency array (from index 1 to 5). Keep track of the maximum frequency found so far and the `ID` of the bird with that frequency.
    *   If you find a bird type with a higher frequency than your current maximum, update the maximum frequency and the result `ID`.
    *   Because you are iterating in ascending order of `ID` (1 through 5), the first time you find the maximum frequency, you are automatically satisfying the tie-breaker rule (return the smallest `ID`)[77].

### Complexity
- **Time:** `O(n)` where `n` is the number of bird sightings. This is because we iterate through the input array once to count frequencies and then a constant number of times (5) to find the max.
- **Space:** `O(1)` because the frequency array has a fixed size (6), which does not depend on the input size `n`.
