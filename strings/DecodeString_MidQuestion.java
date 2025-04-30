package strings;
import java.util.*;

public class DecodeString_MidQuestion {
    public static void main(String[] args) {
        String str="3[a]2[bc]";
        System.out.println(decodeString(str));
        System.out.println(decodeStringOrg(str));
    }

    public static String decodeString(String s) {
        int start = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                ans += subStr(s.substring(start, i+1));
                start = i + 1;
            }
        }
        return ans;

    }

    public static String subStr(String str) {
        int num = Character.getNumericValue(str.charAt(0));
        String ans = "";
        for (int i = 0; i < num; i++) {
            ans += str.substring(2, str.length());
        }
        return str;
    }


    //Right code for Decode String

    public static String decodeStringOrg(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String currStr = "";
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // Support multiple digit numbers
            } else if (ch == '[') {
                countStack.push(k);
                strStack.push(currStr);
                k = 0;
                currStr = "";
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int count = countStack.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(currStr);
                }
                currStr = temp.toString();
            } else {
                currStr += ch;
            }
        }

        return currStr;
    }
}
