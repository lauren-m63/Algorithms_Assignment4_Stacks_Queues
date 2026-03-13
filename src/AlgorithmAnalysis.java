public class AlgorithmAnalysis {


/*
(text) Algorithm Analysis [10 points]
For each of the algorithms you wrote for problems 4-6, explain their time complexity and space
complexity using Big-O notation. Explain how you arrived at your answer.


4. Balanced Symbols
- the time complexity is O(n) where n is the length of the given String because as input size increases
everytime you run the algorithm you always push each element exactly one time onto the stack and do stack operations on it
- the space complexity is O(n) where n is the length of the given input string because everytime you run the loop
you store only the opening symbols onto the stack so the worst case scenario would be if all the
characters were opening characters because then all of them would be pushed onto the stack up to n


5. decode string

time complexity is O(m+k) where m is the length of the given string input and k is the amount you repeat the given substring ebecause
everytime you run the algorithm you iterate through each character exactly once for the length of the string, then you also repeat
the substring k times which creates a new variable everytime so you touch that substring k times

the space complexity is O(m + n) where m is the length of the given strings bracket characters and n is the length of the substring
because I store my characters symbols at most one time in the stack and store previous substrings at most one time in a stack



 */



}
