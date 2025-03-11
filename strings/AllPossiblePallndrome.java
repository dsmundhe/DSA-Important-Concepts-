package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPossiblePallndrome {
    public static void main(String[] args) {
        String str="nitin";
        System.out.println(palindromes(str));
    }

    public static ArrayList palindromes(String str){
        ArrayList<String>list=new ArrayList<>();
         for(int i=0;i<str.length();i++){
             for(int j=0;j<=i;j++){
                 String st=str.substring(j,i+1);
                 if(isPalindrome(st) && !st.equals("")){
                     list.add(st);
                 }
             }
         }
         return list;
    }
    public static boolean isPalindrome(String str){
        int s=0;
        int e=str.length()-1;
      while (s<=e){
          if(str.charAt(s) !=str.charAt(e)){
              return false;
          }
          s++;
          e--;
      }
      return true;
    }
}
