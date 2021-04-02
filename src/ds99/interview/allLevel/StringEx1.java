package ds99.interview.allLevel;

public class StringEx1 {
    //index of first repeated character in String
    static void firstRepeated(String input) {
        char[] freq = new char[256];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println("[" + (char) (i) + "] = " + (int)freq[i]);
            }
        }}

        public static void main (String[]args){
            String input = "ashvani";
            firstRepeated(input);

        }

    }