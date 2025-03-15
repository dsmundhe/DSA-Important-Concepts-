package Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int num=10;
        int num1=0;

        //without handling error
//        int result=num/num1;
//        System.out.println("Result : "+ result);


        // Exception Handling for divide by zero error
        try{
            int ans=num/num1;
            System.out.println("Ans : "+ ans);
        }catch (ArithmeticException e){
            throw new ArithmeticException("Change the dinominator from zero to another num!");
        }
        catch(Exception e){
//            System.out.println(e.getMessage());
            throw new ArithmeticException("Divide by zero!");
        }


        //via function
        System.out.println(divFun(num,num1));

    }

    public static int divFun(int a,int b) throws ArithmeticException{
        try{
           return  a/b;
        }catch(Exception e){
           throw  new ArithmeticException("Divide by zeroooooooooo");
        }
    }
}
