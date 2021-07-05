//Minimum no. of Jumps to reach end of an array : DP
package ds99.dataStructure.allLevel.arrays;

public class Arrays10 {
    static int minimumNumberOfJumps(int[] arr) {
        int n = arr.length;
        //create an array of size n and initialize all it's values as maximum integer value
        int[] dp = new int[n];
        //this will help to check whether we reached at each possible place or not
        for (int i = 0; i < n; i++)
            dp[i] = Integer.MAX_VALUE;

        //we can't reach at oth index from anywhere
        dp[0] = 0;


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                //this is to check we haven't reach to jth position so we can't reach at ith position
                if (dp[j] != Integer.MAX_VALUE && (arr[j] + j >= i)) {


                    //if we can reach ith position using jth position by adding one and it is less than old ith value then change ith value
                    if (dp[j] + 1 < dp[i]) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
        }

        if (dp[n - 1] != Integer.MAX_VALUE) {
            return dp[n - 1];
        } else
            return -1;

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 1, 1, 1};
        System.out.println(minimumNumberOfJumps(arr));

    }
}