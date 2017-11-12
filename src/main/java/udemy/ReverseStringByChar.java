package udemy;

/**
 * Created by prinks on 11/11/17.
 */
public class ReverseStringByChar {
    public String reverse(String initial) {
        String reverseString = "";
        StackChar stack = new StackChar(initial.length());

        for(int i=0; i<initial.length(); i++) {
            stack.push(initial.charAt(i));
        }

        while(!stack.isEmpty()) {
            reverseString += stack.pop();
        }

        return reverseString;
    }
}
