package Stack.Questions;

import java.util.Stack;

public class MinimumParethensesToAdd {
    public static void main(String[] args) {
        String str="()))((";
        System.out.println(parenthesesAdd(str));

    }


    public static int parenthesesAdd(String str){
        if(str.isEmpty()){
            return 0;
        }
        Stack<Character>stack=new Stack<>();
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[') {
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    count++;
                }else{
                    char topChar=stack.pop();
                    if((ch==')'&& topChar !='(') || (ch=='}' && topChar!='{') || (ch==']'&&topChar!='[')){
                        count++;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return count;
        }else {
            return stack.size()+count;
        }
    }


}
