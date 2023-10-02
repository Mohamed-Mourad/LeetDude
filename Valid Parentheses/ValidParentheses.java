import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '[' || c == '{') {
                parentheses.push(c);
            } else if (c == ')') {
                if (parentheses.isEmpty() || parentheses.peek() != '(') {
                    return false;
                }
                parentheses.pop();
            } else if (c == ']') {
                if (parentheses.isEmpty() || parentheses.peek() != '[') {
                    return false;
                }
                parentheses.pop();
            } else if (c == '}') {
                if (parentheses.isEmpty() || parentheses.peek() != '{') {
                    return false;
                }
                parentheses.pop();
            }
        }

        return parentheses.isEmpty();
    }
}