package BigIntegerAndBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass {
    public static void main(String[] args) {
    /**

       BigDecimal class
       useful for storing double and float values large values
       same as BigInteger but works on floating values
       it solve the problem of accuracy while working with fload and double
       where because of binary representation number and exponent weighted that's why it not
       give precise answer

     **/

    //let's with float nums
        double num1=0.04;
        double num2=0.03;
        System.out.println("Answer with double : "+ (num1-num2)); // 0.010000000000000002

        BigDecimal A=new BigDecimal("87968485638758635.365897581");
        BigDecimal B=new BigDecimal("98457632154763.254867952");

        //print nums
        System.out.println("Num A : "+A);
        System.out.println("Num B : "+B);

        //mathematical

        //add
        System.out.println("Addigiton : "+ A.add(B));

        //subtract
        System.out.println("Subtraction : "+A.subtract(B));

        //multiply
        System.out.println("Multiplication : "+A.multiply(B));

        //divide
        System.out.println("Divide : "+ A.divide(B,2, RoundingMode.HALF_DOWN));

        //2, RoundingMode.HALF_DOWN this part pass in divide because the edge case for non-terminating operation
        //Eg. 10/3 =  3.3333333333...........
        //FOR ROUNDING THIS RESULT WE USE THAT

    }
}
