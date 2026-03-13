public class FindInDequeue {

    /*
    Find in deque [10 points] We discussed that using a doubly-linked list, you can search for an
element in O(!
"
), the same is true for a deque.
Given an array-based Deque q and an element y, provide an algorithm that finds the position in a deque
in O(!
"
). Explain your answer.
Hint: The i-th element from the right it a position i, whereas the i-th position from the left it a position
n-i
     */

    /*
    answer:
    you can search in o of n/2 and im supposed to find a position in a deque

    in a deque its a double ended queue so you can add or remove from both the front and back
    pronounced deck and i spelled wrong in the class name

    since you can access both ends you can search from the left and right at the same time
    this way you cut your search time in half because you are always doing it in pairs
    where n is the length of the list
    proof: the time complexity of searching an array based deque is O (n/2) where n
    is the length of the given list because everytime the algorithm runs it searches through
    the list in pairs, thus searching through the list half its length no matter the input size
     */
}
