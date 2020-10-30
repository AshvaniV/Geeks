//Strongest Neighbor: The number which is having large value compare to last value in array is strongest neighbor
/*The task is to find the maximum for every adjacent pairs in the array.
 * Input: 1 2 2 3 4 5
 * Output: 2 2 3 4 5
 */

package ds01.arrays.level1;

public class Arrays_04 {
	private static void maximumAdjacent(int size, int a[]) {
		int max = 0;
		for (int i = 1; i < size; i++) {
			max = (a[i - 1] > a[i] ? a[i - 1] : a[i]);
			System.out.print(max + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 3, 2, 4, 5, 6, 7, 6, 10, 100 };
		int n = a.length;
		maximumAdjacent(n, a);
	}
}