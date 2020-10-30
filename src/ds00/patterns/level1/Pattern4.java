package ds00.patterns.level1;

/*

Half Pyramid after 180 rotation
    *
   **
  ***
 ****
*****

Logic: Here logic is more important for space compare to *.
1st row: n-1 space, rest *
2nd row: n-2 space, rest *
3rd row: n-3 space, rest *

*/
public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}