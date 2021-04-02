//Palindrome String
package ds99.interview.allLevel;

public class String2 {
    int isPalindrome(String S) {
        if (S.length() == 1)
            return 1;
        int start = 0;
        int end = S.length() - 1;
        while (start < end) {
            if (S.charAt(start) != S.charAt(end))
                return 0;
            start++;
            end--;
        }
        return 1;
    }
}
