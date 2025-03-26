package numbers;

public class PrisonersCandey {
    public static void main(String[] args) {
        int n=7;
        int m=19;
        int s=2;
        for (int i = 0; i < m-1; i++) {
            if(s==n){
                s=1;
            }
            else {
                s++;
            }

        }System.out.println(s);

    }
}
