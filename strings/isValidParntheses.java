package strings;

import java.util.Stack;

public class isValidParntheses {
    public static void main(String[] args) {
        String s=new String("[]{");
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == '[' && top != ']')
                ) {

                    return false;
                }
            }
        }
        return stack.isEmpty();
    }





}
