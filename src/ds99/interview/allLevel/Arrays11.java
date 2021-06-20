//find duplicate in an array of N+1 Integers
/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
for n = 7
there can be 8 integers but their value should be in range of 1 to 7.
*/

package ds99.interview.allLevel;

public class Arrays11 {

    static void findDuplicate1(int[] arr, int d) {
         int[] freq = new int[d];
        for (int i = 0; i < d; i++) {
            freq[arr[i]]++;
    //for single duplicate number

            /*if (freq[arr[i]] > 1) {
                System.out.println("duplicate number in array is " + arr[i]);
                break;
            }*/
        }

    //for multiple duplicate numbers
        System.out.println("Duplicate numbers in array are ");
        for (int i = 0; i < d; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        //int[] arr = {1, 3, 4, 2, 2, 5, 6, 7, 8, 9, 2, 10, 1, 10, 3};
        int[] arr = {7,7,7,7,7,7,7,7};
        int d = arr.length;
        findDuplicate1(arr, d);

    }
}

/*
Logic
As we have given value of n then there will be elements from 1 to n and there will be n+1 elements.
there is duplicate element which is available more than once in array. We have to return that element.
create a new array freq[] with size similar to given array. traverse the array and for all it's values increase count on
this index in freq[] array.
now traverse freq[] array and return the index which have value more than 1.

TC => O[N]
SP => O[N]
* */