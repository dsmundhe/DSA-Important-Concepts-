package Stack.Questions;

import java.util.Stack;

public class RemoveParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()()"));
        System.out.println(removeOuterParentheses("(()())(())"));
    }

    public static String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(start, i+1);
            if (isValid(str) && str.length() > 1) {
                String newStr=str.substring(1, str.length()-1);
                ans.append(newStr);
                start = i+1;
            }
        }
        return ans.toString();
    }

    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if ((ch == ')' && topChar != '(') || (ch == '}' && topChar != '{') || (ch == ']' && topChar != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
