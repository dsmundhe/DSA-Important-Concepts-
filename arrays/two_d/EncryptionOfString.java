package arrays.two_d;

public class EncryptionOfString {
    public static void main(String[] args) {
        System.out.println(encryption("DIPAKMUNDHE"));
    }
    public static String encryption(String s) {
        // Write your code here
        int row=(int) Math.floor(Math.sqrt(s.length()));
        int col=(int) Math.ceil(Math.sqrt(s.length()));

        char[][] chars=new char[row][col];
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(count<s.length()){
                    chars[i][j]=s.charAt(count);
                    count++;
                }else {
                    break;
                }
            }
        }
        String ansStr="";
        for(int i=0;i<col;i++){
            String ans="";
            for(int j=0;j<row;j++){
                ans+=chars[j][i];
            }
            ansStr+=ans.trim();
            ansStr+=" ";
        }
        return ansStr;
    }
}
