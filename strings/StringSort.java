package strings;
import java.util.Arrays;
public class StringSort {
    public static void main(String[] args) {
        String str="edcba"; //abcde
        char[] chArr=str.toCharArray();
        Arrays.sort(chArr);
        String newStr=new String(chArr);
        System.out.println(newStr);
    }
}
