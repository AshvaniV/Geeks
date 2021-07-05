//Brian Kernighan’s Algorithm to count set bits in an integer

package ds99.dataStructure.allLevel.bits;

public class Bits4 {
    static void setBits(int N){
        int c=0;
        for(int i=1;i<=N;i++){
            int n=i;


            //Brian Kernighan’s Algorithm to find number of set bits in an integer
            while(n>0){
                n=n&(n-1);
                c++;
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        setBits(5);
    }
}
