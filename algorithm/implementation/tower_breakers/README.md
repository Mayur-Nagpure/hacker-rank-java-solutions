# Tower Breakers

🔗 [Problem Link](https://www.hackerrank.com/challenges/tower-breakers-1/problem)  
💻 Language: Java

### Problem
Two players play a game with **n** towers, each of height **m**.
- Player 1 goes first.
- In each turn, a player chooses a tower of height `x` and reduces it to a new height `y`, where `1 <= y < x` and `y` evenly divides `x`.
- The game ends when a player cannot make a move. The player who cannot move loses.

Given `n` and `m`, determine which player will win if both play optimally. Return `1` for Player 1 or `2` for Player 2.

### Approach
This problem can be solved by analyzing the game's properties rather than simulating the moves[68].

1.  **Case 1: Tower height `m` is 1.**
    - If `m = 1`, Player 1 has no possible moves to make, as they cannot reduce any tower's height.
    - Therefore, Player 2 wins immediately[70].

2.  **Case 2: Number of towers `n` is even.**
    - If `n` is even, Player 1 can make a move on one tower, and Player 2 can always mirror that exact move on another identical tower.
    - This creates pairs of towers. Whatever Player 1 does to a tower in a pair, Player 2 does to the other.
    - Eventually, Player 1 will run out of moves because Player 2 always has a corresponding move.
    - Therefore, Player 2 wins[67][70].

3.  **Case 3: Number of towers `n` is odd and `m > 1`.**
    - If `n` is odd, Player 1 can reduce the first tower to a height of 1.
    - This leaves `n-1` towers (an even number) for Player 2 to deal with.
    - Now, the game state is identical to Case 2, but with Player 2 starting. Since there's an even number of towers left, the second player in this sub-game (who is Player 1 overall) will win.
    - Therefore, Player 1 wins[67].

### Complexity
- **Time:** `O(1)` per test case, as the solution only requires a few conditional checks.
- **Space:** `O(1)` as no extra storage is needed.
