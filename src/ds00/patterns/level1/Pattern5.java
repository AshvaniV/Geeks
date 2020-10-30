package ds00.patterns.level1;

/*

Half Pyramid using number
1
22
333
4444
55555

Logic: Suppose we  have given n, so consider it as total rows and make logic in such a way that for each row
iteration we print row number. Here i will be incremented and treated as row number.
1st row: 1 number in 1 column
2nd row: 2 numbers in 2 columns
3rd row: 3 numbers in 3 columns

*/
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}