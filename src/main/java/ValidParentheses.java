import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        try {
            for (char el : s.toCharArray()) {
                if (el == '(' || el == '{' || el == '[') {
                    stack.push(el);
                } else if (el == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        result = false;
                        break;
                    }
                } else if (el == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        result = false;
                        break;
                    }
                } else if (el == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        } catch (EmptyStackException e) {
            result = false;
        }
        if (!stack.empty()) result = false;
        return result;
    }

    public static void main(String[] args) {
        new ValidParentheses().isValid("}");
    }
}
