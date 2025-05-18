package strings;

public class isPallindromeSentence {
    public static void main(String[] args) {
        String str="madam ,in eden 89.im adam";
        System.out.println("Is Valid Sentence : "+ isValidPara(str));
    }

    public static boolean isValidPara(String str){
        String st=str.replaceAll("\\s","").toLowerCase();

        int start=0;
        int end=st.length()-1;
        while (start<=end){
            while( start<end && ! (st.charAt(start)>='a' && st.charAt(start)<='z')){
                start++;
            }
            while (start < end && ! (st.charAt(end)>='a' && st.charAt(end)<='z')){
                end--;
            }
            if(start<=end){
                if(st.charAt(start)!=st.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }

        }

        return true;
    }
}
