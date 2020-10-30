package ds00.patterns.level1;

/*Floyd's Triangle :

1
2 3
4 5 6
7 8 9 10

Logic:
1st row: 1 number in 1 column and each time increasing by 1
2nd row: 2 numbers in 2 columns and each time increasing by 1
3rd row: 3 numbers in 3 columns and each time increasing by 1
*/
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int out = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(out +" ");
                out++;
            }
            System.out.println();
        }
    }
}
