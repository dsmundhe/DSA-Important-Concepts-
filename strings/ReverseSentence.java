package strings;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String str="Dipak     Samadhan Mundhe";
        String[] strArr=str.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=strArr.length-1;i>=0;i--){
            sb.append(strArr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
