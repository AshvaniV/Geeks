//Smallest sub-array [continuous locations] with sum greater than x
package ds99.interview.allLevel;
public class Arrays31 {
    public static long smallestSubArray(long a[], long n, long x) {
        long sum = 0;
        long minLength = Integer.MAX_VALUE;
        int start = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            while (sum >= x) {
                minLength = Math.min(minLength, i - start + 1);
                sum -= a[start];
                start++;
            }
        }
        return minLength;
    }


    public static void main(String[] args) {
        long[] a = {1, 4, 45, 6, 0, 19,51};
        long x = 51;
        long n = a.length;
        System.out.println(smallestSubArray(a, n, x));;
    }
}


/*
traverse given array and add a[i] to sum, so we will have sum either less than or greater than x.
if it is less than x that means we are yet to get sub array so not to do anything and loop will reach to next element
and it will be added to sum.
If anytime we have sum greater than x that means we have sub-array which sum is stored in sum, now we have to check whether
we have any sub-array in this sub array which length is less than current sub-array and sum is more than x.
So first update min as current sub-array length, update sum as previous sum minus with starting positioned value and increase
start by 1.
So next time whenever sum is greater than x we have to check whether this current sub-array length is less than previous
sub-array length or not and if yes then update sum,min and start.
 */