package Collection;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

//  A stack is linear data structure works on LIFO -> (Last in first out)
//  values stored like stack-plates
//  can perform push and pop operation

//        Stack Operation
//        push -> stack.push(value); add at the top
//        pop -> stack.pop(); remove and return top element
//        isEmpty -> stack.isEmpty(); check weather stack empty
//        peek -> stack.peek() ; get top element without removing
//        search -> stack.search(value); get the position of element

        Stack<Integer> stack=new Stack<>();
//      push value
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack : "+stack);

//      pop value
        System.out.println("Before poped : "+stack);
        System.out.println("Popped Element : "+ stack.pop());
        System.out.println("After poped : "+stack);

//       peek value
        System.out.println("Peek Element : "+ stack.peek());

//      isEmpty
        System.out.println("Is stack Empty : "+stack.isEmpty());

        //reverse string using num
        String str="Hello";
        Stack<Character> stackChars=new Stack<>();
        for(char ch:str.toCharArray()){
             stackChars.push(ch);
        }

       StringBuilder reversed =new StringBuilder();
       while (!stackChars.isEmpty()){
             reversed.append(stackChars.pop());
        }

        System.out.println("Original String : "+str);
        System.out.println("Reversed String : "+reversed);


    }
}
