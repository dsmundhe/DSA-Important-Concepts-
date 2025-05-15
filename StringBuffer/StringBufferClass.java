package StringBuffer;

import java.text.DecimalFormat;
import java.util.Random;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();

        sb.append("Dipak");
        System.out.println(sb.toString());

        //insert at index
        sb.insert(5 ," Mundhe");
        System.out.println(sb.toString());

        //replace string from start to end
        sb.replace(6,7,"m");
        System.out.println(sb.toString());

        //delete string from start to end
        sb.delete(6,7);
        System.out.println(sb.toString());

//        //reverse string
//        sb.reverse();
//        System.out.println(sb.toString());

        //capacity of string

        sb.insert(6,"M");
        System.out.println(sb.capacity());
        System.out.println(sb.toString());

        String str="D I P A K M U N D H E";
        String replaceStr=str.replaceAll("\\s","");
        System.out.println(replaceStr); //DIPAKMUNDHE

        //generate random string
        String randomStr=generateString(10);
        System.out.println(randomStr);

        //Decimal format
        DecimalFormat dc=new DecimalFormat("00.0000");
        int num =3;
        System.out.println(dc.format(num));






    }

    //generate random string
    public static String generateString(int size){
        if(size==0){
            return "";
        }
        Random random=new Random();
        StringBuffer sb=new StringBuffer(size);
        for(int i=0;i<size;i++){
            int randomChar=(int)(random.nextFloat() * 26);
            char ch=(char) (97 + randomChar);
            sb.append(ch);
        }
        return sb.toString();
    }
}
