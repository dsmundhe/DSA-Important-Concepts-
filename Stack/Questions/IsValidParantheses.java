package Stack.Questions;

import java.util.Stack;

public class IsValidParantheses {
    public static void main(String[] args) {
        String str="(())";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s){
        if(s.isEmpty()){
            return false;
        }
        Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' ||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char topChar=stack.pop();
                if((ch==')'&&topChar!='(')||(ch==']'&&topChar!='[')||(ch=='}'&&topChar!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
