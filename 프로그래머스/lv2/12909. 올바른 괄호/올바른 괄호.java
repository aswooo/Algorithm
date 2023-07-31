import java.util.ArrayList;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else
                if (stack.empty())
                    return false;
                else
                    stack.pop();
        }
        return stack.empty();
    }
}