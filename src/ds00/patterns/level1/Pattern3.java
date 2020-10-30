package ds00.patterns.level1;

/*
Inverted Half Pyramid Pattern
We have given a number and we have to draw below pattern out of it.
        n = 4

        * * * *
        * * *
        * *
        *

logic: Run a loop from n to 1 in such a way that it will start printing n * in first row and then decrease by 1 each time.
*/
public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

