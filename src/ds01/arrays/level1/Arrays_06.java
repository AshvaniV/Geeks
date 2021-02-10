//Reverse array in groups
//Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.
/*Example input 5 3
			  1 2 3 4 5
Output :      3 2 1 5 4
*/

package ds01.arrays.level1;

public class Arrays_06 {
	private static int[] reverseArrayInGroup(int[] a, int n, int k) {
		/*
		 * run a loop from start till end, take i as first location and we know that we
		 * have to reverse k elements so take i+k-1 as last element. suppose at last we
		 * are having elements lesser than k then these elements will be last elements
		 * for last iteration
		 */

		for (int i = 0; i < n; i += k) {
			int start = i; 								//first element to swap with end
			int end = i + k - 1; 						//last element to swap with start
			if (end > n - 1) 							//for last iteration when we have less than k elements at last so put last element of array as actual last for swap
			{
				end = n - 1;
			}

			while (start < end) // swap
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		reverseArrayInGroup(array, array.length, 3);
		printArray(array);

	}

	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}
}