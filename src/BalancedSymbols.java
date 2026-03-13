import java.util.LinkedList;

public class BalancedSymbols {

/*

okay so this is just like the leetcode one basically with the parentheses so im just going ot maybe copy that

or i have to use a stack so
im going to go through the string one char at a time so ill convert it to a char array
then if its an opening one ill push onto stack and if its a closing then ill popit if not then ill continue checking them
chill

then time complexity is just O(n) because I go through each thing just once - elemnt in char aray which is length of string
 */

    public static String isBalanced(String s) {

        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(' || c == '<' || c == '¿') {
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) return "NO";
            }

            char top = stack.peek();

            if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{') ||
                    (c == '>' && top == '<') ||
                    (c == '?' && top == '¿')) {
                stack.pop();
            }// end if
            else{
                return "NO";
            }

        }// end for loop

    if (stack.isEmpty()) return "YES";

        return "NO";
    }

}
