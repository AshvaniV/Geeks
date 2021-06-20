//Palindromic Array
/*Given a Integer array A[] of n elements. Your task is to complete the function PalinArray.
Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.*/
package ds99.interview.allLevel;

public class Arrays34 {

    public static int palindromeInArray(int[] arr, int n) {
        //logic is find the reverse of given number and if that comes similar to actual number then return 1 else 0.

        for (int i = 0; i < n; i++) {
            int ans = 0;
            int current = arr[i];

            //reverse a number
            while (current > 0) {
                int remainder = current % 10;
                current = current / 10;
                ans = (ans * 10) + remainder;
            }
            if (ans != arr[i])
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {121, 444, 32123};
        int n = arr.length;
        System.out.println(palindromeInArray(arr, n));

    }

}
