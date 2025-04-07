package strings;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String str="{([])}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        if(str.isEmpty()){
            return false;
        }
        if(str.length()==1){
            return false;
        }
        Stack<Character> stack=new Stack<>();
      for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(ch=='{' || ch=='[' || ch=='('){
           stack.push(ch);
          }else {
              if(stack.isEmpty()){
                  return false;
              }
              char opernChar=stack.pop();
              if((ch=='}' && opernChar!='{')|| (ch==']' && opernChar !='[')|| (ch==')'&&opernChar!='(')){
                  return  false;
              }
          }
      }
      return stack.isEmpty();
    }
}
