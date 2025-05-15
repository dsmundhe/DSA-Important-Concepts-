package BigIntegerAndBigDecimal;

import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {

        /**

        BigInteger
        very useful for storing large value
        it is a predefined class extends Number class
        can store 2^- MAX INTEGER VALUE TO 2^ MAX INTEGER VALUE
        can perform arithmetic operations such as add,subtract,multiply,divide and (modulo) remender

         **/

        //STORE NUM AS STRING
        BigInteger num=new BigInteger("85454454984984");

        //STORE NUM AS INT
        BigInteger num1=BigInteger.valueOf(587698145);

        //STORE CONSTANT VALUE
        BigInteger constVal=BigInteger.TEN;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(constVal);

        //Mathematical Operations
        BigInteger A=new BigInteger("58796345876236");
        BigInteger B=new BigInteger("8796452315789");

        //get value in integer
        int valOfA=A.intValue();
        System.out.println(valOfA); //may give negative value

        //add operation
        System.out.println("Addition : " + A.add(B));

        //subtract
        System.out.println("Subtraction : "+A.subtract(B));

        //multiply
        System.out.println("Multiplication : "+A.multiply(B));

        //divide
        System.out.println("Divide : "+A.divide(B));

        //remainder
        System.out.println("Remebder : "+A.remainder(B));



    }
}
