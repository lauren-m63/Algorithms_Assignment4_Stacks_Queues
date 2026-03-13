public class Queueing {

    /*

     (text) Queueing [10 points] Given an empty queue, what will be the contents of the stack after the
following operations? (Hint: When you have a method inside another method call (e.g., this(that()), that()
will be executed first, afterwards this() will be executed)
• push(2)
• push(pop()+4)
• push(5)
• push(pop()/2)
• pop()
• pop()
     */

    /*
    answer: queueing is FIFO first in first out so
    push 2 = 2
    add 4 to the pop = 6 then push that value = 6 since you popped 2 off
    push 5 = 6,5
    pop 6 since fifo and divide it by 2 = 3 then push that onto = 5,3
    pop the 5 because most recently added = 3
    pop from front again = []

    final queue is empty []


     */
}
