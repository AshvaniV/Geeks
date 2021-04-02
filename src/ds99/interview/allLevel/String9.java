//Print all subsequence of a String
package ds99.interview.allLevel;

public class String9 {

    static void printSubsequence(String input, String outputSoFar){
        if(input.length() == 0)
        {
            System.out.println(outputSoFar);
            return;
        }

        //when not including first character
        printSubsequence(input.substring(1), outputSoFar);

        //when including first character
        printSubsequence(input.substring(1), outputSoFar + input.charAt(0));


    }

    static void printSubsequence(String S){
            printSubsequence(S, "");
    }
    public static void main(String[] args) {
        String S = "abc";
        printSubsequence(S);

    }
}
