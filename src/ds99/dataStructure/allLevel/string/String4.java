//A Program to check if strings are rotations of each other or not

package ds99.dataStructure.allLevel.string;

public class String4 {

    static boolean areRotations(String S1, String S2){
        if(S1.length() != S2.length())
            return false;
        String concat = S1.concat(S1);
        return concat.contains(S2);
    }

    public static void main(String[] args) {
        String S1 = "Ashvani";
        String S2 = "vaniAsh";
        System.out.println(areRotations(S1,S2));
    }
}
