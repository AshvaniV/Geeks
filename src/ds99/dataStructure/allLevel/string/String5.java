//Java Program to Check if a string is a valid shuffle of two distinct strings

package ds99.dataStructure.allLevel.string;
public class String5 {
    // check if result string is valid shuffle of string first and second
    static boolean shuffleCheck(String first, String second, String result) {

        // check length of result is same as
        // sum of result of first and second
        if (first.length() + second.length() != result.length()) {
            return false;
        }
        // variables to track each character of 3 strings
        int i = 0, j = 0, k = 0;

        // iterate through all characters of result
        while (k != result.length()) {

            // check if first character of result matches with first character of first string
            if (i < first.length() && first.charAt(i) == result.charAt(k))
                i++;

                // check if first character of result matches the first character of second string
            else if (j < second.length() && second.charAt(j) == result.charAt(k))
                j++;

                // if the character doesn't match
            else {
                return false;
            }

            // access next character of result
            k++;
        }

        // after accessing all characters of result
        // if either first or second has some characters left
        if (i < first.length() || j < second.length()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String first = "12";
        String second = "aab";
        String[] results = { "12aab"};

        // call the method to check if result string is
        // shuffle of the string first and second
        for (String result : results) {
            if (shuffleCheck(first, second, result)) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            } else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }
    }
}


/*This program fails where we have duplicate characters in 2 strings. for ex: ab12, abb34,abb34ab12
Here it will fail while checking for 3rd character [b] because first 2 characters, it matched with first String and now
it can't match with second string because we haven't increase jth value accordingly*/