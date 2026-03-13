public class Stacking {


    /*

    text) Stacking [10 points] Given an empty stack, what will be the contents of the stack after the
following operations? (Hint: When you have a method inside another method call (e.g., this(that()), that()
will be executed first, afterwards this() will be executed)
• push(1)
• push(20)
• pop()
• push(pop()*2)
• push(0)
• push(pop()/2)
     */



    /*
    answer:

    A stack is LIFO last in first out so, I am going to write down the operations and then the full one at the end
    you push 1 = 1
    push 20 = 1, 20
    pop remvoes top = 1
    push pop*2 , pop first which removes the 1 and then pushes what you popped which is 1times2= 2 then push so you push 2
    now its 2
    push 0 onto the 2 = 2,0
    pop divided by 2 first so you pop and divide what you popped = 0//2 = 0 then push that oepration so push 0 = 0
    now its 2,0 still

    final is [2,0] with 0 at the top of the stack and 2 at the bottom
     */
}
