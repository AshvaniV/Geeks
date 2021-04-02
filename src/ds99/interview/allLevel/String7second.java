package ds99.interview.allLevel;

public class String7second {
    static void longestPalSubstr(String s) {
        int n = s.length();
        boolean[][] b = new boolean[n][n];
        int max = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            b[i][i] = true;
        }
        boolean a = false;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                b[i][i + 1] = true;
                max = 2;
                //there might be a chance that we have more than 2 palindrome
                if (!a) {
                    start = i;
                    a = true;
                }
            }
        }

        for (int k = 3; k <= n; k++) {
            //i is starting position and j is ending position. If we want to check any substring of length 3 or more
            //than 3 then we can check
            for (int i = 0; i < n - k + 1; i++) {
                int j = k + i - 1;
                if (s.charAt(i) == s.charAt(j) && b[i + 1][j - 1]) {
                    b[i][j] = true;
                    if (k > max) {
                        start = i;
                        max = k;
                    }
                }
            }
        }
        System.out.println(s.substring(start, start + max));
    }


    public static void main(String[] args) {
        String str = "aacdee";
        longestPalSubstr(str);
    }
}
