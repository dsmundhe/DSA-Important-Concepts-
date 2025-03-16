package Practice;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        //Sub-Set of "abc"
//      subSet("","abc");

        //sub-set's list
//      System.out.println("SubSets : "+subSetList("","abc"));

        //Permutations of String print
//        combPrint("","ABC");

        //list of permutations
//        System.out.println("List : "+combList("","ABC"));

        //pad key-combinations
//        padComb("","12");
//        padCombSec("","08");
//        orgPadComb("","92");

        //list of Key-pad combinations
        System.out.println("List : "+orgCombpList("","79"));
    }

    //Key-pad combinations

    public static ArrayList<String> orgCombpList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        String[] mappings={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int digit=Character.getNumericValue(up.charAt(0));
        if(digit==1 || digit==0){
            ArrayList<String> ls=new ArrayList<>();
            ls.add("Invalid nums ( 0 & 1 ) ");
            return ls;
        }
        ArrayList<String> list=new ArrayList<>();
        String letters=mappings[digit];
        for(char ch:letters.toCharArray()){
            list.addAll(orgCombpList(p+ch,up.substring(1)));
        }
        return list;
    }

    public static void orgPadComb(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        String[] mappings={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int digit=Character.getNumericValue(up.charAt(0));
        if( digit==0 || digit ==1){
            System.out.println("Invalid Num ! ( 0 & 1 ) ");
            return;
        }
        String letters=mappings[digit];
        for(char ch:letters.toCharArray()){
            orgPadComb(p+ch,up.substring(1));
        }
    }

    public static void padCombSec(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        String[] mapping={"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
        int digit=Character.getNumericValue(up.charAt(0));
        String letters=mapping[digit];
        for(char ch:letters.toCharArray()){
            padCombSec(p+ch,up.substring(1));
        }
    }

    public static void padComb(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char) ('a'+i);
            padComb(p+ch,up.substring(1));
        }
    }

    //permutations of String

    public static ArrayList<String> combList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> list=new ArrayList<>();
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            list.addAll(combList(f+ch+l,up.substring(1)));
        }
        return list;
    }

    public static void combPrint(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            combPrint(f+ch+s,up.substring(1));
        }
    }

    //subset-practice
    public static void subSet(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSet(p+up.charAt(0),up.substring(1));
        subSet(p,up.substring(1));
    }

    //return via list
    public static ArrayList<String> subSetList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> left=subSetList(p+up.charAt(0),up.substring(1));
        ArrayList<String> right=subSetList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
