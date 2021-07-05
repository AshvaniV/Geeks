//Factorials of large numbers


package ds99.dataStructure.allLevel.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Arrays22 {
    public static void main(String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int v = 0; v < t; v++) {
            int n = Integer.parseInt(br.readLine().trim());
            BigInteger b = new BigInteger("1");
            for (int i = 2; i <= n; i++) {
                b = b.multiply(BigInteger.valueOf(i));
            }
            System.out.println(b);
        }
    }
}
