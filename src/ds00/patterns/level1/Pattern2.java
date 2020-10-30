package ds00.patterns.level1;
/*
Hollow Rectangle Pattern
We have given rows and columns and we have to create Hollow rectangle for them.
row: 5 columns : 5

*****
*   *
*   *
*   *
*****

logic: Print * for first and last value of rows and columns and consider space for rest places
*/

public class Pattern2 {
    public static void main(String[] args) {
        int row = 6;
        int column = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if ((i == 1) || (i == row) || (j == 1) || (j == column)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

