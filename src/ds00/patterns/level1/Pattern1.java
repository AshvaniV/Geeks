package ds00.patterns.level1;

/*
Rectangle Pattern
We have given rows and columns and we have to create rectangle for them.
row: 5 columns : 5

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

logic: Run a loop for each row and print * for all columns of each row
*/

public class Pattern1 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
