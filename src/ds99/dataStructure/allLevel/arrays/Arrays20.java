/* **Hard**
Rearrange array in alternating positive & negative items with O(1) extra space
Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}
*/
package ds99.dataStructure.allLevel.arrays;

public class Arrays20 {


    static void rearrange(int[] arr) {
        int i = 0;
        int j = arr.length - 1;


        //move all positive numbers at start of array and negative numbers at last using same array with O(1) extra space
        while (i <= j) {
            if (arr[i] < 0 && arr[j] > 0) {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            } else if (arr[i] > 0 && arr[j] < 0) {
                i++;
                j--;

            } else if (arr[i] > 0) {
                i++;

            } else if (arr[j] < 0) {
                j--;

            }
        }

        //if we have either only negative elements or positive elements
        int n = arr.length;
        if(i==0 || i==n){                 //if i is at 0 that mean all elements are negative, if i == n that means all elements are positive
            for(int a = 0 ; a < n; a++){
                System.out.print(arr[a]+" ");
            }
        }

        else {
            int k = 0;
            while(k<n && i<n){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;

                k = k+2;
                i++;

            }
            for(int a = 0 ; a < n; a++){
                System.out.print(arr[a]+" ");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);

    }
}
